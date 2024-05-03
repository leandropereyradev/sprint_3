package s3_01.n2_abstract_factory.service;

import s3_01.n2_abstract_factory.agenda.AgendaManager;
import s3_01.n2_abstract_factory.contact.contact_factory.ContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

import java.util.List;

public class ContactServiceImplement implements ContactService {

    private AgendaManager agendaManager;

    @Override
    public void addContact(CountryPrefix cityPrefix, String phoneNumber, String address) {
        agendaManager.addContact(cityPrefix, phoneNumber, address);
    }

    @Override
    public List<ContactFactory> listContacts() {
        return agendaManager.getContactList();
    }

    @Override
    public void deleteContact(int index) {
        if (!agendaManager.getContactList().isEmpty()) {
            agendaManager.getContactList().remove(index);

            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("There are no contact.");
        }
    }
}
