package s3_01.n2_abstract_factory.agenda;

import s3_01.n2_abstract_factory.agenda.address.Address;
import s3_01.n2_abstract_factory.agenda.phone.Phone;
import s3_01.n2_abstract_factory.contact.contact_factory.ContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

import java.util.List;

public class AgendaManager {
    private final ContactFactory FACTORY;
    private Phone PHONE;
    private Address ADDRESS;

    private List<ContactFactory> contactList;

    public AgendaManager(ContactFactory factory) {
        this.FACTORY = factory;
    }

    public void addContact(CountryPrefix cityPrefix, String phoneNumber, String address) {
        this.PHONE = FACTORY.createPhone(cityPrefix, phoneNumber);
        this.ADDRESS = FACTORY.createAddress(address);
    }

    public List<ContactFactory> getContactList() {
        return this.contactList;
    }

    @Override
    public String toString() {
        return "Contact added: " +
                "\n\tPhone: " + this.PHONE.getPhoneNumber() +
                "\n\tAddress: " + this.ADDRESS.getAddress();
    }
}
