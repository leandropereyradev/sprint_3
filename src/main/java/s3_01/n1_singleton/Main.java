package s3_01.n1_singleton;

import s3_01.n1_singleton.menu.Menu;
import s3_01.n1_singleton.service.OrderService;
import s3_01.n1_singleton.service.OrderServiceImplement;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImplement();
        Menu menu = new Menu(orderService);
        menu.run();
    }
}
