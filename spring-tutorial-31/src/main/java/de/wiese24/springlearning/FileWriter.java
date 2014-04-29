package de.wiese24.springlearning;

import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements LogWriter {

	public void write(String message) {
		System.out.println("File: " + message);
	}
}
