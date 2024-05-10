package s3_02.n2_callback.exception;

public class PaymentFailureException extends Exception{
    public PaymentFailureException(String msg) {
        super(msg);
    }
}
