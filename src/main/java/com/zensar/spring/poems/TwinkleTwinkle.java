package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	private static final String LINES[] ={
		
		"Twinkle Twinkle Little Star", "How I Wonder What You are", "Up above the world so high",
		"Like a Diamond in the sky"
	};

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String l:LINES)
		{
			System.out.println(l);
		}

	}

}
