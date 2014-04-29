package de.wiese24.springlearning;

public class ConsoleWriter implements LogWriter {

	public void write(String message){
		System.out.println("Console: " + message);
	}
}
