package com.java.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
    public void testMoodAnalyse() {
		/*
		 * Mood analyzer Object
		 */
		MoodAnalyzer md = new MoodAnalyzer();
        String mood = md.analyseMood("This is a SAD message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void testHappyMood() {
    	/*
		 * Mood analyzer Object
		 */
    	MoodAnalyzer md = new MoodAnalyzer();
        String mood = md.analyseMood("This is a HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }
}
