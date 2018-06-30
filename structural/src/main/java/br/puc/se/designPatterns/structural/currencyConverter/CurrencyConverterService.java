package br.puc.se.designPatterns.structural.currencyConverter;

import br.puc.se.designPatterns.structural.currencyConverter.legacy.LegacyCurrencyConverter;


// Adapting an onlinePriceProvider and the new CurrencyValue object and use the same legacy code
// that we have in some old library
public class CurrencyConverterService {
	
	private CurrencyOnlinePriceProvider onlineProvider;
	
	public CurrencyValue convert(CurrencyValue value, String targetCurrency) {
		// create an adapter to call the legacy converter using a online price provider	
                CurrencyConverterAdapter adapter = new CurrencyConverterAdapter(onlineProvider);
		LegacyCurrencyConverter legacyCurrencyConverter = new LegacyCurrencyConverter();
		float converted = legacyCurrencyConverter.convert(adapter, value.getValue(), value.getCurrencyName(), targetCurrency);
		return new CurrencyValue(converted, targetCurrency);
	}
	
	public void setOnlineProvider(CurrencyOnlinePriceProvider onlineProvider) {
		this.onlineProvider = onlineProvider;
	}

}
