package s3_01.n1_singleton.service;

import s3_01.n1_singleton.order.Order;
import s3_01.n1_singleton.undo.Undo;

import java.util.List;

public class OrderServiceImplement implements OrderService {
    private final Undo UNDO = Undo.getInstance();

    @Override
    public void addOrder(Order order) {
        UNDO.addOrder(order);
    }

    @Override
    public List<Order> listOrders() {
        return UNDO.listOrders();
    }

    @Override
    public void deleteOrder(int index) {
        UNDO.undo(index - 1);
    }
}
