package de.wiese24.springlearning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Logger {

	private LogWriter fileWriter;
	private ConsoleWriter consoleWriter;

	@Inject
	@Named(value="fileWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@Inject
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
