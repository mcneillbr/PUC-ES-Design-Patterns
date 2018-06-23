/*

 */
package br.puc.se.designPatterns.creational.factory;

/**
 *
 * @author ra00212217
 */
public class ConsoleOutputLogger extends OutputLogger {

    @Override
    protected String formatMessage(String logMessage) {
         return "ConsoleOutputLogger: " + logMessage;
    }
    
}
