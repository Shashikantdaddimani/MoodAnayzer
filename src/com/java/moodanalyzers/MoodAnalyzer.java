package com.java.moodanalyzers;

public class MoodAnalyzer extends Throwable {
	String message;

	public MoodAnalyzer(String message) {
		this.message = message;

	}

	public MoodAnalyzer() {

	}

	String MoodAnalyzer() {
		return "SAD";
	}

	public String analyseMood(String message) throws MoodAnalyzer, MoodAnalyzerException {
		try {
			if (message.length() == 0)
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,
						"Please enter proper message");
			if (message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,
					"Please enter proper message");
		}
	}
}
