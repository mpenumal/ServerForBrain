package com.asu.tutorcompanion.server.model;

import java.util.Date;

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
	private int linesOfCodeChangedSinceLastRun;
	private String errorType;
	private int errorTotal;
	private int numberRunAttempts;
	private int runAttemptsSinceLastHint;
	private Date submissionDateTime;
	
	@Min(0)
	@Max(1)
	private int assignmentCompletedSuccessfully;
	
	private int errorCountSinceLastHint;
	private String messageGiven;
	private int messageCode;
	
	@Min(0)
	@Max(4)
	private int feedbackSurvey;
	
	// In Review
	// ---------------------------
	private int cyclomaticComplexity;
	private float timerValue;
	private float timeSinceLastRun;
	private float timeIdle;
	private float timeTotal;
	private float timeWorking;
	private float timeWithErrors;
	private float timeUntilErrorFixed;
	private float timeSinceLastHint;
	private float timeMostRecentHint;
	private float timeSecondMostRecentHint;
	
	// ---------------------------
	
	
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
	public int getLinesOfCodeChangedSinceLastRun() {
		return linesOfCodeChangedSinceLastRun;
	}
	public void setLinesOfCodeChangedSinceLastRun(int linesOfCodeChangedSinceLastRun) {
		this.linesOfCodeChangedSinceLastRun = linesOfCodeChangedSinceLastRun;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public int getErrorTotal() {
		return errorTotal;
	}
	public void setErrorTotal(int errorTotal) {
		this.errorTotal = errorTotal;
	}
	public int getNumberRunAttempts() {
		return numberRunAttempts;
	}
	public void setNumberRunAttempts(int numberRunAttempts) {
		this.numberRunAttempts = numberRunAttempts;
	}
	public int getRunAttemptsSinceLastHint() {
		return runAttemptsSinceLastHint;
	}
	public void setRunAttemptsSinceLastHint(int runAttemptsSinceLastHint) {
		this.runAttemptsSinceLastHint = runAttemptsSinceLastHint;
	}
	public Date getSubmissionDateTime() {
		return submissionDateTime;
	}
	public void setSubmissionDateTime(Date submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
	}
	public int getAssignmentCompletedSuccessfully() {
		return assignmentCompletedSuccessfully;
	}
	public void setAssignmentCompletedSuccessfully(int assignmentCompletedSuccessfully) {
		this.assignmentCompletedSuccessfully = assignmentCompletedSuccessfully;
	}
	public int getErrorCountSinceLastHint() {
		return errorCountSinceLastHint;
	}
	public void setErrorCountSinceLastHint(int errorCountSinceLastHint) {
		this.errorCountSinceLastHint = errorCountSinceLastHint;
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
	public float getTimerValue() {
		return timerValue;
	}
	public void setTimerValue(float timerValue) {
		this.timerValue = timerValue;
	}
	public float getTimeSinceLastRun() {
		return timeSinceLastRun;
	}
	public void setTimeSinceLastRun(float timeSinceLastRun) {
		this.timeSinceLastRun = timeSinceLastRun;
	}
	public float getTimeIdle() {
		return timeIdle;
	}
	public void setTimeIdle(float timeIdle) {
		this.timeIdle = timeIdle;
	}
	public float getTimeTotal() {
		return timeTotal;
	}
	public void setTimeTotal(float timeTotal) {
		this.timeTotal = timeTotal;
	}
	public float getTimeWorking() {
		return timeWorking;
	}
	public void setTimeWorking(float timeWorking) {
		this.timeWorking = timeWorking;
	}
	public float getTimeWithErrors() {
		return timeWithErrors;
	}
	public void setTimeWithErrors(float timeWithErrors) {
		this.timeWithErrors = timeWithErrors;
	}
	public float getTimeUntilErrorFixed() {
		return timeUntilErrorFixed;
	}
	public void setTimeUntilErrorFixed(float timeUntilErrorFixed) {
		this.timeUntilErrorFixed = timeUntilErrorFixed;
	}
	public float getTimeSinceLastHint() {
		return timeSinceLastHint;
	}
	public void setTimeSinceLastHint(float timeSinceLastHint) {
		this.timeSinceLastHint = timeSinceLastHint;
	}
	public float getTimeMostRecentHint() {
		return timeMostRecentHint;
	}
	public void setTimeMostRecentHint(float timeMostRecentHint) {
		this.timeMostRecentHint = timeMostRecentHint;
	}
	public float getTimeSecondMostRecentHint() {
		return timeSecondMostRecentHint;
	}
	public void setTimeSecondMostRecentHint(float timeSecondMostRecentHint) {
		this.timeSecondMostRecentHint = timeSecondMostRecentHint;
	}
	
}
