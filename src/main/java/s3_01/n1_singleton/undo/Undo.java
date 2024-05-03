package s3_01.n1_singleton.undo;

import s3_01.n1_singleton.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private final List<Order> HISTORY;

    private Undo() {
        HISTORY = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(Order order) {
        HISTORY.add(order);
    }

    public void undo(int index) {
        if (!HISTORY.isEmpty()) {
            HISTORY.remove(index);

            System.out.println("Order deleted successfully.");
        } else {
            System.out.println("There are no undo orders.");
        }
    }

    public List<Order> listOrders() {
        return this.HISTORY;
    }
}
