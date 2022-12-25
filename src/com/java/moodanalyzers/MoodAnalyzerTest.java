package com.java.moodanalyzers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class MoodAnalyzerTest {
	@Test
	public void testMoodAnalyse() throws MoodAnalyzer, MoodAnalyzerException {
		MoodAnalyzer md = new MoodAnalyzer();
		String mood = md.analyseMood("This is a SAD message");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void testHappyMood() throws MoodAnalyzer, MoodAnalyzerException {
		MoodAnalyzer md = new MoodAnalyzer();
		String mood = md.analyseMood("This is a HAPPY message");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMoodShouldReturnHappy() {
		MoodAnalyzer md = new MoodAnalyzer(null);
		String mood = null;
		try {
			mood = md.analyseMood("This is a HAPPY message");
		} catch (MoodAnalyzer moodAnalyser) {
			moodAnalyser.printStackTrace();
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenInAnyMood_Should_Return_Happy() throws MoodAnalyzer, MoodAnalyzerException {
		MoodAnalyzer md = new MoodAnalyzer();
		String mood = md.analyseMood("This is in any mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenInHappy_MoodShould_ReturnSad() throws MoodAnalyzer, MoodAnalyzerException {
		MoodAnalyzer md = new MoodAnalyzer();
		String mood = md.analyseMood("This is in HAPPY mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMoodShouldThrowException() throws MoodAnalyzer {
		MoodAnalyzer md = new MoodAnalyzer(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyzerException.class);
			md.analyseMood(null);
		} catch (Exception e) {
			Assert.assertEquals("Please enter proper message", e.getMessage());
		}

	}
}
