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
	@PostMapping("/inputs/{id}")
	public ResponseEntity<Input> updateInputById(@PathVariable(value="id") int id, @Valid @RequestBody Input newInput) {
		Input input = new Input();
		
		Optional<Input> oldInput = inputDAO.getById(id);
		if (oldInput.isPresent() && oldInput.get() != null) {
			input = inputDAO.save(copy(newInput, oldInput.get()));
		} else {
			input = inputDAO.save(newInput);
		}
		
		return ResponseEntity.ok().body(input);
	}
	
	/* GetAll inputs */
	@GetMapping("/inputs")
	public List<Input> getAllInputs() {
		return inputDAO.getAll();
	}
	
	/* Get an input by Id */
	@GetMapping("/inputs/{id}")
	public ResponseEntity<Input> getInputById(@PathVariable(value="Id") int id) {
		Optional<Input> input = inputDAO.getById(id);
		
		if (!input.isPresent() || input.get() == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(input.get());
	}
	
	private Input copy(Input newInput, Input oldInput) {
		oldInput.setAssignmentCompleted(newInput.getAssignmentCompleted());
		oldInput.setAssignmentCompletedSuccessfully(newInput.getAssignmentCompletedSuccessfully());
		oldInput.setCyclomaticComplexity(newInput.getCyclomaticComplexity());
		oldInput.setErrorCountSinceLastHint(newInput.getErrorCountSinceLastHint());
		
		oldInput.setErrorsResolvedTotal(newInput.getErrorsResolvedTotal());
		oldInput.setErrorTotal(newInput.getErrorTotal());
		oldInput.setErrorType(newInput.getErrorType());
		oldInput.setKeywordComparatorFound(newInput.getKeywordComparatorFound());
		
		oldInput.setKeywordDoubleFound(newInput.getKeywordDoubleFound());
		oldInput.setKeyWordFloatFound(newInput.getKeyWordFloatFound());
		oldInput.setKeywordForWhileDoFound(newInput.getKeywordForWhileDoFound());
		oldInput.setKeywordIfFound(newInput.getKeywordIfFound());
		
		oldInput.setKeywordMainFound(newInput.getKeywordMainFound());
		oldInput.setKeywordNewFound(newInput.getKeywordNewFound());
		oldInput.setKeywordReturnFound(newInput.getKeywordReturnFound());
		oldInput.setLinesOfCodeChangedSinceLastRun(newInput.getLinesOfCodeChangedSinceLastRun());
		
		oldInput.setLinesOfCodeTotal(newInput.getLinesOfCodeTotal());
		oldInput.setNumberOfCommentLines(newInput.getNumberOfCommentLines());
		oldInput.setNumberOfMethods(newInput.getNumberOfMethods());
		oldInput.setNumberRunAttempts(newInput.getNumberRunAttempts());
		
		oldInput.setRunAttemptsSinceLastHint(newInput.getRunAttemptsSinceLastHint());
		oldInput.setSubmissionDate(newInput.getSubmissionDate());
		oldInput.setSubmissionTimestamp(newInput.getSubmissionTimestamp());
		oldInput.setTimeIdle(newInput.getTimeIdle());
		
		oldInput.setTimeLastEncouragement(newInput.getTimeLastEncouragement());
		oldInput.setTimeMostRecentHint(newInput.getTimeMostRecentHint());
		oldInput.setTimerValue(newInput.getTimerValue());
		oldInput.setTimeSecondMostRecentHint(newInput.getTimeSecondMostRecentHint());
		
		oldInput.setTimeSinceLastHint(newInput.getTimeSinceLastHint());
		oldInput.setTimeSinceLastRun(newInput.getTimeSinceLastRun());
		oldInput.setTimeTotal(newInput.getTimeTotal());
		oldInput.setTimeUntilErrorFixed(newInput.getTimeUntilErrorFixed());
		
		oldInput.setTimeWithErrors(newInput.getTimeWithErrors());
		oldInput.setTimeWorking(newInput.getTimeWorking());
		
		return oldInput;
	}
}
