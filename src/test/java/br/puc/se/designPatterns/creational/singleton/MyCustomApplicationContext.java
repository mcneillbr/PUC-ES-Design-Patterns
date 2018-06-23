/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.se.designPatterns.creational.singleton;

/**
 *
 * @author ra00212217
 */
class MyCustomApplicationContext {
    
    private static MyCustomApplicationContext ctx;
    
    private MyCustomApplicationContext(){
        
    }
    
    public static MyCustomApplicationContext getInstance(){
        
        if(ctx == null) {
            ctx = new MyCustomApplicationContext();
        }
        
        return ctx;
    }
}
