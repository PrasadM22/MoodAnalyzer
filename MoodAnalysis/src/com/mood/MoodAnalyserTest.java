package com.mood;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
	public String analyseMood(String message){
        if(message.contains(("sad"))) return "SAD";
        else return "HAPPY";
    }
	
	@Test
    public void TC1() {

        String mood = analyseMood("This is a sad message");
        Assert.assertEquals("SAD",mood);
    }
	@Test
	public void TC2()
	{
		String mood = analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",mood);
	}
}
