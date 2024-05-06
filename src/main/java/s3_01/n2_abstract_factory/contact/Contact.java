package s3_01.n2_abstract_factory.contact;

import s3_01.n2_abstract_factory.agenda.address.Address;
import s3_01.n2_abstract_factory.agenda.phone.Phone;

public class Contact {
    private final Phone phone;
    private final Address address;

    public Contact(Phone phone, Address address) {
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone.getPhoneNumber();
    }

    public String getAddress() {
        return address.getAddress();
    }

    @Override
    public String toString() {
        return "\tPhone: " + phone.getPhoneNumber() +
                "\n\tAddress: " + address.getAddress();
    }
}

