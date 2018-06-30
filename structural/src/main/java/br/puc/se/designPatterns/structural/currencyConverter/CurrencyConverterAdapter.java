/*
 * 
 * 
 * 
 */
package br.puc.se.designPatterns.structural.currencyConverter;

import br.puc.se.designPatterns.structural.currencyConverter.legacy.PriceProvider;

/**
 *
 * @author ra00212217
 */
public class CurrencyConverterAdapter implements PriceProvider {

    private CurrencyOnlinePriceProvider onlineProvider;
    public CurrencyConverterAdapter(CurrencyOnlinePriceProvider onlineProvider){
        
        this.onlineProvider = onlineProvider;
    }
    
    @Override
    public float getConvertionFactor(String databasename, String currencyName, String targetCurrency) {
        return onlineProvider.onlinePrice(currencyName, targetCurrency);
    }
    
}
