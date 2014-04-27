package de.wiese24.springlearning;

public class FileWriter implements LogWriter {

	public void write(String message){
		System.out.println("File: " + message);
	}
}
