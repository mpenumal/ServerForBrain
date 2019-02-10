package com.asu.tutorcompanion.server.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asu.tutorcompanion.server.model.Input;
import com.asu.tutorcompanion.server.service.AssignmentService;
import com.asu.tutorcompanion.server.service.InputService;

@RestController
@RequestMapping("/server")
public class InputController {
	@Autowired
	InputService inputService;
	
	@Autowired
	AssignmentService assignmentService;
	
	/* Insert an input */
	@PostMapping("/inputs")
	public ResponseEntity<Input> saveInput(@Valid @RequestBody Input newInput) {
		Resource resource = assignmentService.findOneAssignment(newInput.getAssignmentName());
		if (resource != null) {
			Input savedInput = inputService.save(newInput);
			return ResponseEntity.ok().body(savedInput);
		}
		return ResponseEntity.notFound().build();
	}
	
	/* GetAll inputs */
	@GetMapping("/inputs")
	public List<Input> getAllInputs() {
		return inputService.getAll();
	}
	
	/* Get an input by studentId */
	@GetMapping("/inputs/{studentId}")
	public ResponseEntity<List<Input>> getInputById(@PathVariable(value="studentId") int studentId) {
		List<Input> inputList = inputService.getByStudentId(studentId);
		if (inputList == null || inputList.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(inputList);
	}
}
