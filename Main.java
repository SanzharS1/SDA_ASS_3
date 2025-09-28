public class Main {
    public static void main(String[] args) {
        DollarExchangeAPI dollarAPI = new DollarExchangeAPI();
        EuroExchangeAPI euroAPI = new EuroExchangeAPI();

        CurrencyExchange dollarAdapter = new DollarAdapter(dollarAPI);
        CurrencyExchange euroAdapter = new EuroAdapter(euroAPI);

        System.out.println("Dollar to Ruble rate: " + dollarAdapter.getExchangeRate("USD", "RUB"));
        System.out.println("Euro to Ruble rate: " + euroAdapter.getExchangeRate("EUR", "RUB"));
    }
}
