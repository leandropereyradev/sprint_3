package s3_02.n3_dependency_injection.currency_converter;

public class CurrencyConverterImpl implements ConverterInterface{

    @Override
    public double converterCurrency(double amount, String targetCurrency) {
        return amount;
    }
}
