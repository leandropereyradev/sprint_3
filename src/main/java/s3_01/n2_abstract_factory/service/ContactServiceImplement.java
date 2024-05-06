package s3_01.n2_abstract_factory.service;

import s3_01.n2_abstract_factory.agenda.AgendaManager;
import s3_01.n2_abstract_factory.contact.Contact;
import s3_01.n2_abstract_factory.contact.international_contact_factory.InternationalContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

import java.util.List;

public class ContactServiceImplement implements ContactService {

    private final AgendaManager ANGEDA_MANAGER = new AgendaManager(new InternationalContactFactory());

    @Override
    public void addContact(CountryPrefix cityPrefix, String phoneNumber, String address) {
        ANGEDA_MANAGER.addContact(cityPrefix, phoneNumber, address);
    }

    @Override
    public List<Contact> listContacts() {
        return ANGEDA_MANAGER.getContactList();
    }

    @Override
    public void deleteContact(int index) {
        if (!ANGEDA_MANAGER.getContactList().isEmpty()) {
            ANGEDA_MANAGER.getContactList().remove(index);

            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("There are no contact.");
        }
    }
}
