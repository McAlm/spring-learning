package de.wiese24.springlearning;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	//@Autowired
	private FileWriter fileWriter;
	//@Autowired
	private ConsoleWriter consoleWriter;

	@Autowired
	public Logger(FileWriter fileWriter, ConsoleWriter consoleWriter) {
		super();
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
	}

	//@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	//@Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeFile(String message) {
		this.fileWriter.write(message);
	}

	public void writeConsole(String message) {
		this.consoleWriter.write(message);
	}
}
