package de.wiese24.springlearning;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 0;
	private String speech = "Hello!";

	public void speak() {
		System.out.println(id + " " + speech);
	}

	@Inject
	public void setId(@Value("1123") int id) {
		this.id = id;
	}

	@Inject
	public void setSpeech(@Value("Hi there!") String speech) {
		this.speech = speech;
	}

}
