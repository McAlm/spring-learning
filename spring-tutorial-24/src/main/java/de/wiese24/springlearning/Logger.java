package de.wiese24.springlearning;

public class Logger {

	private FileWriter fileWriter;
	private ConsoleWriter consoleWriter;

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

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
