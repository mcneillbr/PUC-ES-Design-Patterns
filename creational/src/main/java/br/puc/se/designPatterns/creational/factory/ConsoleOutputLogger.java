package br.puc.se.designPatterns.creational.factory;

public class ConsoleOutputLogger extends OutputLogger {

	@Override
	protected String formatMessage(String logMessage) {
		return logMessage;
	}

}
