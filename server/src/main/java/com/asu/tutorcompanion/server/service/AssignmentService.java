package com.asu.tutorcompanion.server.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.asu.tutorcompanion.server.model.Assignment;
import com.asu.tutorcompanion.server.repository.AssignmentRepository;

@Service
public class AssignmentService {
	
	private static String UPLOAD_ROOT = "upload_dir"; 
	
	private final AssignmentRepository assignmentRepository;
	private final ResourceLoader resourceLoader;
	
	@Autowired
	public AssignmentService(AssignmentRepository assignmentRepository, ResourceLoader resourceLoader) {
		this.assignmentRepository = assignmentRepository;
		this.resourceLoader = resourceLoader;
	}
	
	public Resource findOneAssignment(String assignmentName) {
		Date currentDate = new Date();
		final Assignment assignment= assignmentRepository.findByAssignmentName(assignmentName);
		if (currentDate.compareTo(assignment.getStartDate()) >= 0 &&
				currentDate.compareTo(assignment.getEndDate()) <= 0) {
			return resourceLoader.getResource("file:" + UPLOAD_ROOT + "/" + assignmentName);	
		}
		return null;
	}
	
	public void createAssignment(MultipartFile file, Assignment assignment) throws IOException {
		if (!Files.isDirectory(Paths.get(UPLOAD_ROOT))) {
			Files.createDirectory(Paths.get(UPLOAD_ROOT));
		}
		if (!file.isEmpty()) {
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_ROOT, file.getOriginalFilename()));
			assignmentRepository.save(assignment);
		}
	}
	
	public void deleteAssignment(String assignmentName) throws IOException {
		final Assignment assignment= assignmentRepository.findByAssignmentName(assignmentName);
		assignmentRepository.delete(assignment);
		Files.deleteIfExists(Paths.get(UPLOAD_ROOT, assignmentName));		
	}
}
