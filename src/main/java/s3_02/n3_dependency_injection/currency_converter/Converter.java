package s3_02.n3_dependency_injection.currency_converter;

import s3_02.n3_dependency_injection.exception.CurrencyException;

public class Converter {
    private final ConverterInterface CONVERTER_INTERFACE;

    public Converter(ConverterInterface converterInterface) {
        this.CONVERTER_INTERFACE = converterInterface;
    }

    public void getCurrencyAmount(String itemName, double price, String originalCurrency, String... targetCurrencies) throws CurrencyException {
        System.out.println("Price of " + itemName + ":");
        System.out.println("- " + originalCurrency + ": " + price);

        for (String targetCurrency : targetCurrencies) {
            double value;

            switch (targetCurrency) {
                case "LIRA" -> value = 1.4;
                case "USD" -> value = 1.8;
                case "PESO_ARG" -> value = 2.3;
                default -> throw new CurrencyException("Moneda " + targetCurrency + " no encontrada");
            }

            double convertedPrice = CONVERTER_INTERFACE.converterCurrency(price, targetCurrency) * value;
            System.out.println("\t- " + targetCurrency + ": " + convertedPrice);

        }
    }

}
