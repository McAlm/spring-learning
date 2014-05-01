package de.wiese24.springlearning;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id ="Default robot";
	private String speech = "Hello!";

	public void speak() {
		System.out.println(id + " " + speech);
	}

	@Inject
	public void setId(@Value("#{ systemProperties['user.name']}")String id) {
		this.id = id;
	}

	@Inject
	//new java.util.Date().toString()
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI / 4) ^ 2 le 0.8 ? 'yes' : 'no'}") String speech) {
		this.speech = speech;
	}

}
