public class DollarAdapter implements CurrencyExchange {
    private DollarExchangeAPI dollarAPI;

    public DollarAdapter(DollarExchangeAPI dollarAPI) {
        this.dollarAPI = dollarAPI;
    }

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("RUB")) {
            return dollarAPI.getDollarToRubleRate();
        }
        return 0.0;
    }
}
