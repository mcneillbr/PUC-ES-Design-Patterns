/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.se.designPatterns.creational.factory;

/**
 *
 * @author ra00212217
 */

public class LogFactory {

    public OutputLogger of(LoggerType type) {
        switch (type) {
            case HTTP_POST:
                return new HTTPOutputLogger();
            case CONSOLE:
                return new ConsoleOutputLogger();
            case FILE:
                return new FileOutputLogger();
            case JMS:
                return new JMSOutputLogger();
            default:                
            return new ConsoleOutputLogger();
        }
    }

}
