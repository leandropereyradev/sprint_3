package s3_01.n2_abstract_factory.contact.international_contact_factory;

import s3_01.n2_abstract_factory.agenda.address.Address;
import s3_01.n2_abstract_factory.agenda.phone.Phone;
import s3_01.n2_abstract_factory.contact.contact_abstract.ContactAbstract;
import s3_01.n2_abstract_factory.contact.international_address.InternationalAddress;
import s3_01.n2_abstract_factory.contact.international_phone.CountryPrefix;
import s3_01.n2_abstract_factory.contact.international_phone.InternationalPhone;

public class InternationalContactFactory implements ContactAbstract {
    @Override
    public Phone createPhone(CountryPrefix countryPrefix, String phoneNumber) {
        return new InternationalPhone(countryPrefix, phoneNumber);
    }

    @Override
    public Address createAddress(String address) {
        return new InternationalAddress(address);
    }
}
