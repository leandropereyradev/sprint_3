package s3_01.n2_abstract_factory.contact.international_address;

import s3_01.n2_abstract_factory.agenda.address.Address;

public class InternationalAddress implements Address {
    private final String ADDRESS;

    public InternationalAddress(String address) {
        this.ADDRESS = address;
    }

    @Override
    public String getAddress() {
        return this.ADDRESS;
    }
}
