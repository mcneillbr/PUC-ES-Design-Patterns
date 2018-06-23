package br.puc.se.designPatterns.creational.builder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HttpInputBuilder implements InputBuilder<HttpInputConnection> {

    private Properties connectionProperties;
    private final HttpInputConnection httpConn;
    
    public HttpInputBuilder(){
        httpConn = new HttpInputConnection();
    }

    public HttpInputBuilder fromPropertyFile(String fileName) throws FileNotFoundException, IOException {
        this.connectionProperties = BuilderUtilities.readPropertiesFromResourceFile(fileName);
        httpConn.setHost(this.connectionProperties.getProperty("host"));
        httpConn.setPort(this.connectionProperties.getProperty("port"));
        httpConn.setMethod(this.connectionProperties.getProperty("method"));
        httpConn.setProtocol(this.connectionProperties.getProperty("protocol"));
        return this;
    }

    @Override
    public Input<HttpInputConnection> build() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return () -> httpConn;
    }

    public HttpInputBuilder fromHost(String localhost) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        httpConn.setHost(localhost);
        return this;
    }

    public HttpInputBuilder usingProtocol(String http) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        httpConn.setProtocol(http);
        return this;
    }

    public HttpInputBuilder onPort(int i) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        httpConn.setPort(String.valueOf(i));
        return this;
    }

    public HttpInputBuilder usingMethod(String get) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        httpConn.setMethod(get);
        return this;
    }

}
