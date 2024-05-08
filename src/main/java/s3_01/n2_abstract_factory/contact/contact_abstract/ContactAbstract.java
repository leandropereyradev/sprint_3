package s3_01.n2_abstract_factory.contact.contact_abstract;

import s3_01.n2_abstract_factory.agenda.address.Address;
import s3_01.n2_abstract_factory.agenda.phone.Phone;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;

public interface ContactAbstract {
    Phone createPhone(CountryPrefix cityPrefix, String phoneNumber);

    Address createAddress(String address);
}
