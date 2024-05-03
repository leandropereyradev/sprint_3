package s3_01.n1_singleton.order;

public class Order {
    private final int ORDER_NUMBER;
    private final String ORDER;

    public Order(int orderNumber, String order) {
        this.ORDER_NUMBER = orderNumber;
        this.ORDER = order;
    }

    @Override
    public String toString() {
        return "\tOrder #: " + this.ORDER_NUMBER +
                "\n\tOrder: " + this.ORDER;
    }
}
