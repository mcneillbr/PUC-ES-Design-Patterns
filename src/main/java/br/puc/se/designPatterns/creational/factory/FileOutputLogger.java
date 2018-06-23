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
public class FileOutputLogger extends OutputLogger {

    public FileOutputLogger() {
    }

    @Override
    protected String formatMessage(String logMessage) {
        return "FileOutputLogger: " + logMessage;
    }
    
}
