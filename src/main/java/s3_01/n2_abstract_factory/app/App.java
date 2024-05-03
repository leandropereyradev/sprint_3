package s3_01.n2_abstract_factory.app;

import s3_01.n2_abstract_factory.agenda.AgendaManager;
import s3_01.n2_abstract_factory.contact.contact_factory.ContactFactory;
import s3_01.n2_abstract_factory.contact.international_contact_factory.InternationalContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;
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

        printChoosePrefixMenu();

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

        System.out.println("Write the telephone number: ");
        String phoneScanner = scanner.nextLine();

        System.out.println("Write the address: ");
        String addressScanner = scanner.nextLine();
        this.contactNumber++;

        AgendaManager agenda = new AgendaManager(new InternationalContactFactory());

        agenda.addContact(prefix, phoneScanner, addressScanner);

        System.out.println(agenda);
    }

    private void printChoosePrefixMenu() {
        System.out.println();

        for (CountryPrefix country : CountryPrefix.values()) {
            System.out.println("\t" + country.getID() +
                    ". " + country.getCountry() +
                    "(" + country.getPrefix() + ")");
        }
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

        System.out.println("\nContact List:");

        for (ContactFactory contact : CONTACT_SERVICE.listContacts()) {
            System.out.println(contact);
            System.out.println("\n");
        }
    }

    private void deleteContact(Scanner scanner) {
        if (CONTACT_SERVICE.listContacts().isEmpty()) {
            System.out.println("There are no contacts to delete.");
            return;
        }

        System.out.print("Enter the contactID to delete: ");
        int i = scanner.nextInt();

        try {
            CONTACT_SERVICE.deleteContact(i);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ContactID not found.");
        }
    }

    private void printMenuOptions() {
        System.out.println("\n");
        System.out.println("1. Add contact");
        System.out.println("2. List contacts");
        System.out.println("3. Delete contact");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }
}
