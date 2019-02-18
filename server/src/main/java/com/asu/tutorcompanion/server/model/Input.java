package com.asu.tutorcompanion.server.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "input")
@EntityListeners(AuditingEntityListener.class)
public class Input {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int studentId;
	private Action action;
	private String assignmentName;
	private int linesOfCodeTotal;
	
	@Min(0)
	@Max(1)
	private int keywordComparatorFound;

	@Min(0)
	@Max(1)
	private int keywordNewFound;

	@Min(0)
	@Max(1)
	private int keywordDoubleFound;

	@Min(0)
	@Max(1)
	private int keyWordFloatFound;

	@Min(0)
	@Max(1)
	private int keywordIfFound;

	@Min(0)
	@Max(1)
	private int keywordForWhileDoFound;

	@Min(0)
	@Max(1)
	private int keywordReturnFound;
	
	private int numberOfCommentLines;
	private String errorType;
	private String submissionDateTime;
	
	@Min(0)
	@Max(1)
	private int assignmentCompletedSuccessfully;
	private String messageGiven;
	private int messageCode;
	
	@Min(0)
	@Max(4)
	private int feedbackSurvey;

	private int cyclomaticComplexity;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public String getAssignmentName() {
		return assignmentName;
	}
	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}
	public int getLinesOfCodeTotal() {
		return linesOfCodeTotal;
	}
	public void setLinesOfCodeTotal(int linesOfCodeTotal) {
		this.linesOfCodeTotal = linesOfCodeTotal;
	}
	public int getKeywordComparatorFound() {
		return keywordComparatorFound;
	}
	public void setKeywordComparatorFound(int keywordComparatorFound) {
		this.keywordComparatorFound = keywordComparatorFound;
	}
	public int getKeywordNewFound() {
		return keywordNewFound;
	}
	public void setKeywordNewFound(int keywordNewFound) {
		this.keywordNewFound = keywordNewFound;
	}
	public int getKeywordDoubleFound() {
		return keywordDoubleFound;
	}
	public void setKeywordDoubleFound(int keywordDoubleFound) {
		this.keywordDoubleFound = keywordDoubleFound;
	}
	public int getKeyWordFloatFound() {
		return keyWordFloatFound;
	}
	public void setKeyWordFloatFound(int keyWordFloatFound) {
		this.keyWordFloatFound = keyWordFloatFound;
	}
	public int getKeywordIfFound() {
		return keywordIfFound;
	}
	public void setKeywordIfFound(int keywordIfFound) {
		this.keywordIfFound = keywordIfFound;
	}
	public int getKeywordForWhileDoFound() {
		return keywordForWhileDoFound;
	}
	public void setKeywordForWhileDoFound(int keywordForWhileDoFound) {
		this.keywordForWhileDoFound = keywordForWhileDoFound;
	}
	public int getKeywordReturnFound() {
		return keywordReturnFound;
	}
	public void setKeywordReturnFound(int keywordReturnFound) {
		this.keywordReturnFound = keywordReturnFound;
	}
	public int getNumberOfCommentLines() {
		return numberOfCommentLines;
	}
	public void setNumberOfCommentLines(int numberOfCommentLines) {
		this.numberOfCommentLines = numberOfCommentLines;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getSubmissionDateTime() {
		return submissionDateTime;
	}
	public void setSubmissionDateTime(String submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
	}
	public int getAssignmentCompletedSuccessfully() {
		return assignmentCompletedSuccessfully;
	}
	public void setAssignmentCompletedSuccessfully(int assignmentCompletedSuccessfully) {
		this.assignmentCompletedSuccessfully = assignmentCompletedSuccessfully;
	}
	public String getMessageGiven() {
		return messageGiven;
	}
	public void setMessageGiven(String messageGiven) {
		this.messageGiven = messageGiven;
	}
	public int getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}
	public int getFeedbackSurvey() {
		return feedbackSurvey;
	}
	public void setFeedbackSurvey(int feedbackSurvey) {
		this.feedbackSurvey = feedbackSurvey;
	}
	public int getCyclomaticComplexity() {
		return cyclomaticComplexity;
	}
	public void setCyclomaticComplexity(int cyclomaticComplexity) {
		this.cyclomaticComplexity = cyclomaticComplexity;
	}
	
}
