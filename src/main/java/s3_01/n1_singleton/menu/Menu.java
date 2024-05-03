package s3_01.n1_singleton.menu;

import s3_01.n1_singleton.order.Order;
import s3_01.n1_singleton.service.OrderService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final OrderService ORDER_SERVICE;
    private int orderNumber = 0;

    public Menu(OrderService orderService) {
        this.ORDER_SERVICE = orderService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            printMenuOptions();

            try {
                option = scanner.nextInt();
                scanner.nextLine();
                handleMenuOption(option, scanner);

            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please enter a number.");
                scanner.nextLine();
                option = 0;

            }

        } while (option != 4);
    }

    private void handleMenuOption(int option, Scanner scanner) {
        switch (option) {
            case MenuOption.ADD_ORDER -> addOder(scanner);
            case MenuOption.LIST_ORDERS -> listOrders();
            case MenuOption.DELETE_ORDER -> deleteOrder(scanner);
            case MenuOption.EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    private void addOder(Scanner scanner) {
        if (ORDER_SERVICE.listOrders().isEmpty()) {
            this.orderNumber = 0;
        }

        System.out.print("Enter the order: ");
        String orderScanner = scanner.nextLine();
        this.orderNumber++;

        Order order = new Order(this.orderNumber, orderScanner);

        ORDER_SERVICE.addOrder(order);
    }

    private void listOrders() {
        if (ORDER_SERVICE.listOrders().isEmpty()) {
            System.out.println("There are no orders to show.");
            return;
        }

        System.out.println("\nOrder List:");

        for (Order order : ORDER_SERVICE.listOrders()) {
            System.out.println(order);
            System.out.println("\n");
        }
    }

    private void deleteOrder(Scanner scanner) {
        if (ORDER_SERVICE.listOrders().isEmpty()) {
            System.out.println("There are no orders to delete.");
            return;
        }

        System.out.print("Enter the order number to delete: ");
        int i = scanner.nextInt();

        try {
            ORDER_SERVICE.deleteOrder(i);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Order number not found.");
        }
    }

    private void printMenuOptions() {
        System.out.println("\n");
        System.out.println("1. Add order");
        System.out.println("2. List orders");
        System.out.println("3. Delete order");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }
}
