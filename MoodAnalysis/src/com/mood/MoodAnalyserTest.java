package com.mood;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
	public String analyseMood(String message){
        if(message.contains(("sad"))) return "SAD";
        else return "HAPPY";
    }
	@Test
    public void testMoodAnalysis() {

        String mood = analyseMood("This is a sad message");

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
