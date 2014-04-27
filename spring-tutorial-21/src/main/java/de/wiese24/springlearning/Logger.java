package de.wiese24.springlearning;

public class Logger {

	private LogWriter fileWriter;
	private LogWriter consoleWriter;

	public Logger(FileWriter fileWriter, ConsoleWriter consoleWriter) {
		super();
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
	}

	public void writeFile(String message) {
		this.fileWriter.write(message);
	}

	public void writeConsole(String message) {
		this.consoleWriter.write(message);
	}
}
