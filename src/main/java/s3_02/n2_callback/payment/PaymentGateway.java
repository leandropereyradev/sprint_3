package s3_02.n2_callback.payment;

import s3_02.n2_callback.exception.PaymentFailureException;

public class PaymentGateway {
    public void processPayment(String paymentMethod, double amount, PaymentCallback callback) {

        boolean paymentSuccess = Math.random() < 0.5;

        try {
            if (paymentSuccess) {
                callback.onPayment(paymentMethod, amount);

            } else {
                System.out.println("\tError al procesar pago.");

                String errorMsg = "Error al procesar el pago por importe de "
                        + amount + "€ con método de pago "
                        + paymentMethod;

                throw new PaymentFailureException(errorMsg);
            }

        } catch (PaymentFailureException e) {
            System.err.println(e.getMessage());
        }
    }
}
