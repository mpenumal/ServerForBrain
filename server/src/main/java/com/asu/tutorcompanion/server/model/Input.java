package com.asu.tutorcompanion.server.model;

import java.util.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "input")
@EntityListeners(AuditingEntityListener.class)
public class Input {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private int studentId;
	
	@NotBlank
	private Action action;
	
	@NotBlank
	private String assignmentName;
	
	private int NumberOfMethods;

	@Min(0)
	@Max(1)
	private int KeywordMainFound;
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

	@Min(0)
	@Max(1)
	private int HelpButtonClicked;

	private int NumberOfCommentLines;
	private int LinesOfCodeChangedSinceLastRun;
	private int CyclomaticComplexity;
	private String ErrorType;
	private int ErrorTotal;
	private int ErrorsResolvedTotal;
	private int NumberRunAttempts;
	private int RunAttemptsSinceLastHint;
	private Time SubmissionTimestamp;
	private Date SubmissionDate;
	private float TimerValue;
	private float TimeSinceLastRun;
	private float TimeIdle;
	private float TimeTotal;
	private float TimeWorking;
	private float TimeWithErrors;
	private float TimeUntilErrorFixed;
	private float TimeSinceLastHint;
	
	@Min(0)
	@Max(4)
	private int feedback;

	@Min(0)
	@Max(1)
	private int AssignmentCompleted;

	@Min(0)
	@Max(1)
	private int AssignmentCompletedSuccessfully;

	private int ErrorCountSinceLastHint;
	private float TimeLastEncouragement;
	private float TimeMostRecentHint;
	private float TimeSecondMostRecentHint;

	

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

	public int getNumberOfMethods() {
		return NumberOfMethods;
	}

	public void setNumberOfMethods(int numberOfMethods) {
		NumberOfMethods = numberOfMethods;
	}

	public int getKeywordMainFound() {
		return KeywordMainFound;
	}

	public void setKeywordMainFound(int keywordMainFound) {
		KeywordMainFound = keywordMainFound;
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

	public int getCyclomaticComplexity() {
		return CyclomaticComplexity;
	}

	public void setCyclomaticComplexity(int cyclomaticComplexity) {
		CyclomaticComplexity = cyclomaticComplexity;
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

	public int getErrorsResolvedTotal() {
		return ErrorsResolvedTotal;
	}

	public void setErrorsResolvedTotal(int errorsResolvedTotal) {
		ErrorsResolvedTotal = errorsResolvedTotal;
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

	public Time getSubmissionTimestamp() {
		return SubmissionTimestamp;
	}

	public void setSubmissionTimestamp(Time submissionTimestamp) {
		SubmissionTimestamp = submissionTimestamp;
	}

	public Date getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		SubmissionDate = submissionDate;
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

	public int getAssignmentCompleted() {
		return AssignmentCompleted;
	}

	public void setAssignmentCompleted(int assignmentCompleted) {
		AssignmentCompleted = assignmentCompleted;
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

	public float getTimeLastEncouragement() {
		return TimeLastEncouragement;
	}

	public void setTimeLastEncouragement(float timeLastEncouragement) {
		TimeLastEncouragement = timeLastEncouragement;
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

	public int getHelpButtonClicked() {
		return HelpButtonClicked;
	}

	public void setHelpButtonClicked(int helpButtonClicked) {
		HelpButtonClicked = helpButtonClicked;
	}

	public int getFeedback() {
		return feedback;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

}
