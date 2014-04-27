package de.wiese24.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

	@Autowired
	@Qualifier(value="toFile")
	private LogWriter fileWriter;
	@Autowired
	@Qualifier(value="toConsole")
	private ConsoleWriter consoleWriter;

	public void writeFile(String message) {
		this.fileWriter.write(message);
	}

	public void writeConsole(String message) {
			this.consoleWriter.write(message);
	}
}
