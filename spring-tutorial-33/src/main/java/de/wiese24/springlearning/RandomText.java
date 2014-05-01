package de.wiese24.springlearning;

import java.util.Random;

public class RandomText {

	private static String[]  texts =new String[]{
		"Hi, there!",
		"I want your clothes, boots and motorcycle!",
		"Get out!",
		null
	};
	
	public String getText(){
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
