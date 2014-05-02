package de.wiese24.springlearning;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "Default robot";
	private String speech = "Hello!";

	public void speak() {
		System.out.println(id + " " + speech);
	}

	@Inject
	public void setId(@Value("${jdbc.user}") String id) {
		this.id = id;
	}

	@Inject
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}

}
