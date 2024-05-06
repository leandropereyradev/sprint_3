package s3_01.n2_abstract_factory.contact.international_phone;

import s3_01.n2_abstract_factory.agenda.phone.Phone;

public class InternationalPhone implements Phone {
    private final CountryPrefix CITY_PREFIX;
    private final String PHONE_NUMBER;

    public InternationalPhone(CountryPrefix cityPrefix, String phoneNumber) {
        this.PHONE_NUMBER = phoneNumber;
        this.CITY_PREFIX = cityPrefix;
    }

    @Override
    public String getPhoneNumber() {
        return this.CITY_PREFIX.getPrefix() + " " + this.PHONE_NUMBER;
    }
}
