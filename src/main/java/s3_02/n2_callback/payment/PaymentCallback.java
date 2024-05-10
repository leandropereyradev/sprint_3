package s3_02.n2_callback.payment;

public interface PaymentCallback {
    void onPayment(String paymentMethod, double amount);
}
