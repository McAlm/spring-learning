package de.wiese24.springlearning;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void write(String message){
		System.out.println("Console: " + message);
	}
}
