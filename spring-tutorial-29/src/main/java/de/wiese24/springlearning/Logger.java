package de.wiese24.springlearning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Logger {

	private LogWriter fileWriter;
	private ConsoleWriter consoleWriter;

	@Resource
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@Resource(name = "myConsoleWriter")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeFile(String message) {
		this.fileWriter.write(message);
	}

	public void writeConsole(String message) {
		this.consoleWriter.write(message);
	}

	@PostConstruct
	public void init() {
		System.out.println("Logger initiated!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Logger destroyed!");
	}
}
