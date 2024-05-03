package s3_01.n2_abstract_factory.service;

import s3_01.n2_abstract_factory.contact.contact_factory.ContactFactory;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

import java.util.List;

public interface ContactService {

    void addContact(CountryPrefix cityPrefix, String phoneNumber, String address);

    List<ContactFactory> listContacts();

    void deleteContact(int index);
}
