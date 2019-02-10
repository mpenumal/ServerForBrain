package com.asu.tutorcompanion.server.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.asu.tutorcompanion.server.model.Assignment;
import com.asu.tutorcompanion.server.service.AssignmentService;

@RestController
@RequestMapping("/server")
public class AssignmentController {
	@Autowired
	AssignmentService assignmentService;
	
	/* Insert an assignment */
	@PostMapping("/assignments/{start}/{end}")
	public void saveAssignment(
			@PathVariable(value="start") int start,
			@PathVariable(value="end") int end,
			@Valid @RequestParam("file") MultipartFile file
	) throws ParseException, IOException {
		String assignmentName = file.getOriginalFilename();
		Assignment assignment = createAssignmentObj(start, end, assignmentName);
		
		List<Assignment> assignmentList = assignmentService.findAll();
		List<Assignment> assignmentMatches = assignmentList.stream()
				.filter(item -> (item.getEndDate().compareTo(assignment.getStartDate()) >= 0))
				.collect(Collectors.toList());
		
		if (assignmentMatches == null || assignmentMatches.isEmpty()) {
			assignmentService.createAssignment(file, assignment);	
		}
	}
	
	@DeleteMapping("/assignments/{assignmentName}")
	public void deleteAssignment(@PathVariable(value="assignmentName") String assignmentName) throws IOException {
		assignmentService.deleteAssignment(assignmentName);
	}
	
	@GetMapping("/assignments")
	public ResponseEntity<Resource> getAssignment() {
		Date currentDate = new Date();
		List<Assignment> assignmentList = assignmentService.findAll();
		List<Assignment> assignmentMatches = assignmentList.stream()
				.filter(item -> 
					((item.getStartDate().compareTo(currentDate) >= 0) &&
					 (item.getEndDate().compareTo(currentDate) <= 0))
				)
				.collect(Collectors.toList());
		
		String assignmentName = assignmentMatches.get(0).getAssignmentName();
		Resource resource = assignmentService.findOneAssignment(assignmentName);
		String contentType = "application/octet-stream";
		return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
	}

	private Assignment createAssignmentObj(
			int start, int end, String assignmentName
	) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date currentDate = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		
		Date startDate = sdf.parse(year + "/" + month + "/" + start + " 00:00:00");
		Date endDate = end >= start 
						? sdf.parse(year + "/" + month + "/" + end + " 23:59:59")
						: sdf.parse(year + "/" + (month + 1) + "/" + end + " 23:59:59");
		
		Assignment assignment = new  Assignment();
		assignment.setAssignmentName(assignmentName);
		assignment.setStartDate(startDate);
		assignment.setEndDate(endDate);
		return assignment;
	}
}
