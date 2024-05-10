package s3_02.n2_callback;

import s3_02.n2_callback.payment.PaymentGateway;
import s3_02.n2_callback.store.ShoeStore;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        shoeStore.buyShoes("Tarjeta de crédito", 50.0);
        shoeStore.buyShoes("PayPal", 70.0);
        shoeStore.buyShoes("Deuda en cuenta bancaria", 100.0);
    }
}
