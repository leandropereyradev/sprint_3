package s3_02.n2_callback.store;

import s3_02.n2_callback.payment.PaymentCallback;
import s3_02.n2_callback.payment.PaymentGateway;

public class ShoeStore {
    private final PaymentGateway PAYMENT_GATEWAY;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.PAYMENT_GATEWAY = paymentGateway;
    }

    public void buyShoes(String paymentMethod, double amount) {
        System.out.println("Realizando compra de zapatos por " + amount + "€ con " + paymentMethod);

        PaymentCallback paymentCallback = new PaymentCallback() {
            @Override
            public void onPayment(String paymentMethod, double amount) {
                System.out.println("\tPago exitoso de " + amount + "€ con " + paymentMethod);
            }
        };

        PAYMENT_GATEWAY.processPayment(paymentMethod, amount, paymentCallback);
    }
}
