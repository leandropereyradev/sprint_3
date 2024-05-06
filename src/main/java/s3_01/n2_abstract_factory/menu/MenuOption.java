package s3_01.n2_abstract_factory.menu;

import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

public class MenuOption {
    public static final int ADD_CONTACT = 1;
    public static final int LIST_CONTACT = 2;
    public static final int DELETE_CONTACT = 3;
    public static final int EXIT = 4;

    public static void printMainMenuOptions() {
        System.out.println("\n");
        System.out.println("1. Add contact");
        System.out.println("2. List contacts");
        System.out.println("3. Delete contact");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    public static void printChoosePrefixMenu() {
        System.out.println();

        for (CountryPrefix country : CountryPrefix.values()) {
            System.out.println("\t" + country.getID() +
                    ". " + country.getCountry() +
                    "(" + country.getPrefix() + ")");
        }
    }
}
