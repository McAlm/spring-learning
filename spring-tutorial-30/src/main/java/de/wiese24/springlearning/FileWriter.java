package de.wiese24.springlearning;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("toFile")
public class FileWriter implements LogWriter {

	public void write(String message){
		System.out.println("File: " + message);
	}
}
