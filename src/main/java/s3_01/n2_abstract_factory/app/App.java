package s3_01.n2_abstract_factory.app;

import s3_01.n2_abstract_factory.contact.Contact;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;
import s3_01.n2_abstract_factory.menu.MenuOption;
import s3_01.n2_abstract_factory.service.ContactService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final ContactService CONTACT_SERVICE;
    private int contactNumber = 0;

    public App(ContactService contactService) {
        this.CONTACT_SERVICE = contactService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            MenuOption.printMainMenuOptions();

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
            case MenuOption.ADD_CONTACT -> addContact(scanner);
            case MenuOption.LIST_CONTACT -> listContacts();
            case MenuOption.DELETE_CONTACT -> deleteContact(scanner);
            case MenuOption.EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    private void addContact(Scanner scanner) {
        System.out.print("\n\tChoose the country: ");
        boolean isChosen = false;
        int option;
        CountryPrefix prefix = null;

        MenuOption.printChoosePrefixMenu();

        while (!isChosen) {
            try {
                System.out.println("Select a country (Ex.: 1):");
                option = scanner.nextInt();
                scanner.nextLine();
                prefix = handlePrefixOption(option);

                isChosen = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please select a country.");
            }
        }

        int phoneScanner = 0;
        boolean isNum = false;

        while (!isNum) {
            System.out.println("Write the telephone number: ");

            try {
                phoneScanner = scanner.nextInt();
                scanner.nextLine();
                isNum = true;
            } catch (InputMismatchException e) {
                System.out.println("Must be a number.");
                scanner.nextLine();
            }
        }

        System.out.println("Write the address: ");
        String addressScanner = scanner.nextLine();
        this.contactNumber++;

        this.CONTACT_SERVICE.addContact(prefix, String.valueOf(phoneScanner), addressScanner);

        System.out.println("Contact added:");

        System.out.println(CONTACT_SERVICE.listContacts().get(CONTACT_SERVICE.listContacts().size() - 1));
    }

    private CountryPrefix handlePrefixOption(int option) {
        CountryPrefix countryPrefix = null;

        switch (option) {
            case 1 -> countryPrefix = CountryPrefix.ARGENTINA;
            case 2 -> countryPrefix = CountryPrefix.BRASIL;
            case 3 -> countryPrefix = CountryPrefix.ESPANA;
            case 4 -> countryPrefix = CountryPrefix.ITALIA;
            default -> throw new InputMismatchException();
        }

        return countryPrefix;
    }

    private void listContacts() {
        if (CONTACT_SERVICE.listContacts().isEmpty()) {
            System.out.println("There are no contacts to show.");
            return;
        }

        System.out.println("Contact list:");

        for (int i = 0; i < CONTACT_SERVICE.listContacts().size(); i++) {

            String phone = String.valueOf(CONTACT_SERVICE.listContacts().get(i).getPhone());
            String address = String.valueOf(CONTACT_SERVICE.listContacts().get(i).getAddress());

            System.out.println("\n\tContact #: " + (i + 1));
            System.out.println("\t\tPhone: " + phone);
            System.out.println("\t\tAddress: " + address);
        }
    }

    private void deleteContact(Scanner scanner) {
        if (CONTACT_SERVICE.listContacts().isEmpty()) {
            System.out.println("There are no contacts to delete.");
            return;
        }

        System.out.print("Enter the Contact # to delete: ");
        int i = scanner.nextInt();

        try {
            Contact contactToDelete = CONTACT_SERVICE.listContacts().get(i - 1);

            CONTACT_SERVICE.deleteContact(i - 1);

            System.out.println("Contact deleted:");
            System.out.println(contactToDelete);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Contact # not found.");
        }
    }
}
