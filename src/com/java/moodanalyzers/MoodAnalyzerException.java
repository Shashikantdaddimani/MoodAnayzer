package com.java.moodanalyzers;

public class MoodAnalyzerException extends Exception {
	/*
	 * constructor
	 */
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	ExceptionType type;

	public MoodAnalyzerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
