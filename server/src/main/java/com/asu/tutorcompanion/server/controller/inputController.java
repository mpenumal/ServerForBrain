package com.asu.tutorcompanion.server.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asu.tutorcompanion.server.dao.InputDAO;
import com.asu.tutorcompanion.server.model.Input;

@RestController
@RequestMapping("/server")
public class inputController {
	@Autowired
	InputDAO inputDAO;
	
	/* Insert or Update an input by Id */
	@PostMapping("/inputs")
	public ResponseEntity<Input> updateInputById(@Valid @RequestBody Input newInput) {
		Input savedInput = inputDAO.save(newInput);
		return ResponseEntity.ok().body(savedInput);
	}
	
	/* GetAll inputs */
	@GetMapping("/inputs")
	public List<Input> getAllInputs() {
		return inputDAO.getAll();
	}
	
	/* Get an input by Id */
	@GetMapping("/inputs/{studentId}")
	public ResponseEntity<List<Input>> getInputById(@PathVariable(value="studentId") int studentId) {
		List<Input> inputList = inputDAO.getByStudentId(studentId);
		if (inputList == null || inputList.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(inputList);
	}
}
