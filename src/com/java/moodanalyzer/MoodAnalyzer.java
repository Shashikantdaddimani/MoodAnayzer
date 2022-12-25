package com.java.moodanalyzer;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		if (message.contains("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}

}
