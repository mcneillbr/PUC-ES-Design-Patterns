/*
 * 
 * 
 * 
 */
package br.puc.se.designPatterns.creational.factory;


/**
 *
 * @author ra00212217
 */
public class HTTPOutputLogger extends OutputLogger  {

    @Override
    protected String formatMessage(String logMessage) {
        return "HTTPOutputLogger: " + logMessage;
    }
    
}
