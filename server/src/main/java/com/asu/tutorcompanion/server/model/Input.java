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
	private int LinesOfCodeTotal;
	
	@Min(0)
	@Max(1)
	private int KeywordComparatorFound;

	@Min(0)
	@Max(1)
	private int KeywordNewFound;

	@Min(0)
	@Max(1)
	private int KeywordDoubleFound;

	@Min(0)
	@Max(1)
	private int KeyWordFloatFound;

	@Min(0)
	@Max(1)
	private int KeywordIfFound;

	@Min(0)
	@Max(1)
	private int KeywordForWhileDoFound;

	@Min(0)
	@Max(1)
	private int KeywordReturnFound;
	
	private int NumberOfCommentLines;
	private int LinesOfCodeChangedSinceLastRun;
	private String ErrorType;
	private int ErrorTotal;
	private int NumberRunAttempts;
	private int RunAttemptsSinceLastHint;
	private Date SubmissionDateTime;
	
	@Min(0)
	@Max(1)
	private int AssignmentCompletedSuccessfully;
	
	private int ErrorCountSinceLastHint;
	private String messageGiven;
	private int messageCode;
	
	@Min(0)
	@Max(4)
	private int feedback;
	
	// In Review
	// ---------------------------
	private int CyclomaticComplexity;
	private float TimerValue;
	private float TimeSinceLastRun;
	private float TimeIdle;
	private float TimeTotal;
	private float TimeWorking;
	private float TimeWithErrors;
	private float TimeUntilErrorFixed;
	private float TimeSinceLastHint;
	private float TimeMostRecentHint;
	private float TimeSecondMostRecentHint;
	
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
		return LinesOfCodeTotal;
	}
	public void setLinesOfCodeTotal(int linesOfCodeTotal) {
		LinesOfCodeTotal = linesOfCodeTotal;
	}
	public int getKeywordComparatorFound() {
		return KeywordComparatorFound;
	}
	public void setKeywordComparatorFound(int keywordComparatorFound) {
		KeywordComparatorFound = keywordComparatorFound;
	}
	public int getKeywordNewFound() {
		return KeywordNewFound;
	}
	public void setKeywordNewFound(int keywordNewFound) {
		KeywordNewFound = keywordNewFound;
	}
	public int getKeywordDoubleFound() {
		return KeywordDoubleFound;
	}
	public void setKeywordDoubleFound(int keywordDoubleFound) {
		KeywordDoubleFound = keywordDoubleFound;
	}
	public int getKeyWordFloatFound() {
		return KeyWordFloatFound;
	}
	public void setKeyWordFloatFound(int keyWordFloatFound) {
		KeyWordFloatFound = keyWordFloatFound;
	}
	public int getKeywordIfFound() {
		return KeywordIfFound;
	}
	public void setKeywordIfFound(int keywordIfFound) {
		KeywordIfFound = keywordIfFound;
	}
	public int getKeywordForWhileDoFound() {
		return KeywordForWhileDoFound;
	}
	public void setKeywordForWhileDoFound(int keywordForWhileDoFound) {
		KeywordForWhileDoFound = keywordForWhileDoFound;
	}
	public int getKeywordReturnFound() {
		return KeywordReturnFound;
	}
	public void setKeywordReturnFound(int keywordReturnFound) {
		KeywordReturnFound = keywordReturnFound;
	}
	public int getNumberOfCommentLines() {
		return NumberOfCommentLines;
	}
	public void setNumberOfCommentLines(int numberOfCommentLines) {
		NumberOfCommentLines = numberOfCommentLines;
	}
	public int getLinesOfCodeChangedSinceLastRun() {
		return LinesOfCodeChangedSinceLastRun;
	}
	public void setLinesOfCodeChangedSinceLastRun(int linesOfCodeChangedSinceLastRun) {
		LinesOfCodeChangedSinceLastRun = linesOfCodeChangedSinceLastRun;
	}
	public String getErrorType() {
		return ErrorType;
	}
	public void setErrorType(String errorType) {
		ErrorType = errorType;
	}
	public int getErrorTotal() {
		return ErrorTotal;
	}
	public void setErrorTotal(int errorTotal) {
		ErrorTotal = errorTotal;
	}
	public int getNumberRunAttempts() {
		return NumberRunAttempts;
	}
	public void setNumberRunAttempts(int numberRunAttempts) {
		NumberRunAttempts = numberRunAttempts;
	}
	public int getRunAttemptsSinceLastHint() {
		return RunAttemptsSinceLastHint;
	}
	public void setRunAttemptsSinceLastHint(int runAttemptsSinceLastHint) {
		RunAttemptsSinceLastHint = runAttemptsSinceLastHint;
	}
	public Date getSubmissionDateTime() {
		return SubmissionDateTime;
	}
	public void setSubmissionDateTime(Date submissionDateTime) {
		SubmissionDateTime = submissionDateTime;
	}
	public int getAssignmentCompletedSuccessfully() {
		return AssignmentCompletedSuccessfully;
	}
	public void setAssignmentCompletedSuccessfully(int assignmentCompletedSuccessfully) {
		AssignmentCompletedSuccessfully = assignmentCompletedSuccessfully;
	}
	public int getErrorCountSinceLastHint() {
		return ErrorCountSinceLastHint;
	}
	public void setErrorCountSinceLastHint(int errorCountSinceLastHint) {
		ErrorCountSinceLastHint = errorCountSinceLastHint;
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
	public int getFeedback() {
		return feedback;
	}
	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}
	public int getCyclomaticComplexity() {
		return CyclomaticComplexity;
	}
	public void setCyclomaticComplexity(int cyclomaticComplexity) {
		CyclomaticComplexity = cyclomaticComplexity;
	}
	public float getTimerValue() {
		return TimerValue;
	}
	public void setTimerValue(float timerValue) {
		TimerValue = timerValue;
	}
	public float getTimeSinceLastRun() {
		return TimeSinceLastRun;
	}
	public void setTimeSinceLastRun(float timeSinceLastRun) {
		TimeSinceLastRun = timeSinceLastRun;
	}
	public float getTimeIdle() {
		return TimeIdle;
	}
	public void setTimeIdle(float timeIdle) {
		TimeIdle = timeIdle;
	}
	public float getTimeTotal() {
		return TimeTotal;
	}
	public void setTimeTotal(float timeTotal) {
		TimeTotal = timeTotal;
	}
	public float getTimeWorking() {
		return TimeWorking;
	}
	public void setTimeWorking(float timeWorking) {
		TimeWorking = timeWorking;
	}
	public float getTimeWithErrors() {
		return TimeWithErrors;
	}
	public void setTimeWithErrors(float timeWithErrors) {
		TimeWithErrors = timeWithErrors;
	}
	public float getTimeUntilErrorFixed() {
		return TimeUntilErrorFixed;
	}
	public void setTimeUntilErrorFixed(float timeUntilErrorFixed) {
		TimeUntilErrorFixed = timeUntilErrorFixed;
	}
	public float getTimeSinceLastHint() {
		return TimeSinceLastHint;
	}
	public void setTimeSinceLastHint(float timeSinceLastHint) {
		TimeSinceLastHint = timeSinceLastHint;
	}
	public float getTimeMostRecentHint() {
		return TimeMostRecentHint;
	}
	public void setTimeMostRecentHint(float timeMostRecentHint) {
		TimeMostRecentHint = timeMostRecentHint;
	}
	public float getTimeSecondMostRecentHint() {
		return TimeSecondMostRecentHint;
	}
	public void setTimeSecondMostRecentHint(float timeSecondMostRecentHint) {
		TimeSecondMostRecentHint = timeSecondMostRecentHint;
	}
	
}
