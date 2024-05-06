package s3_01.n2_abstract_factory.agenda;

import s3_01.n2_abstract_factory.agenda.address.Address;
import s3_01.n2_abstract_factory.agenda.phone.Phone;
import s3_01.n2_abstract_factory.contact.Contact;
import s3_01.n2_abstract_factory.contact.contact_factory.ContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

import java.util.ArrayList;
import java.util.List;

public class AgendaManager {
    private final ContactFactory FACTORY;
    private final List<Contact> CONTACT_LIST = new ArrayList<>();

    public AgendaManager(ContactFactory factory) {
        this.FACTORY = factory;
    }

    public void addContact(CountryPrefix cityPrefix, String phoneNumber, String address) {
        Phone phone = FACTORY.createPhone(cityPrefix, phoneNumber);
        Address addr = FACTORY.createAddress(address);

        Contact contact = new Contact(phone, addr);
        this.CONTACT_LIST.add(contact);
    }

    public List<Contact> getContactList() {
        return this.CONTACT_LIST;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contacts added:\n");

        for (int i = 0; i < CONTACT_LIST.size(); i++) {
            Contact contact = CONTACT_LIST.get(i);
            sb.append("\nContact ").append(i + 1).append(":\n").append(contact);
        }

        return sb.toString();
    }
}
