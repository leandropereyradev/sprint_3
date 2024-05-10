package s3_02.n3_dependency_injection.currency_converter;

public interface ConverterInterface {
    double converterCurrency(double amount, String targetCurrency);
}
