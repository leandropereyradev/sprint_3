package s3_01.n1_singleton.service;

import s3_01.n1_singleton.order.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    List<Order> listOrders();

    void deleteOrder(int index);
}
