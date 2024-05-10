package s3_02.n3_dependency_injection;

import s3_02.n3_dependency_injection.currency_converter.Converter;
import s3_02.n3_dependency_injection.currency_converter.ConverterInterface;
import s3_02.n3_dependency_injection.currency_converter.CurrencyConverterImpl;
import s3_02.n3_dependency_injection.exception.CurrencyException;

public class Main {
    public static void main(String[] args) {
        ConverterInterface currencyConverter = new CurrencyConverterImpl();
        Converter priceToConvert = new Converter(currencyConverter);

        try {
            priceToConvert.getCurrencyAmount("Shoes", 50.0, "EUR", "USD", "PESO_ARG", "NO_EXISTE");

        } catch (CurrencyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
