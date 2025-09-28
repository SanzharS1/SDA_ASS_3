public class EuroAdapter implements CurrencyExchange {
    private EuroExchangeAPI euroAPI;

    public EuroAdapter(EuroExchangeAPI euroAPI) {
        this.euroAPI = euroAPI;
    }

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("RUB")) {
            return euroAPI.getEuroToRubleRate();
        }
        return 0.0;
    }
}
