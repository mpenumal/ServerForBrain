package com.asu.tutorcompanion.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asu.tutorcompanion.server.model.Input;
import com.asu.tutorcompanion.server.repository.InputRepository;

@Service
public class InputService {
	@Autowired
	InputRepository inputRepository;
	
	/* Save an input */
	public Input save(Input input) {
		return inputRepository.save(input);
	}
	
	/* GetAll inputs */
	public List<Input> getAll() {
		return inputRepository.findAll();
	}
	
	/* Get an input by Id */
	public List<Input> getByStudentId(int studentId) {
		return inputRepository.findByStudentId(studentId);
	}
	
}
