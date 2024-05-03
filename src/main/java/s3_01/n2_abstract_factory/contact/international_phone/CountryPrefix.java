package s3_01.n2_abstract_factory.contact.international_phone;

public enum CountryPrefix {
    ARGENTINA("+54", "Argentina", "1"),
    ESPANA("+34", "Spain", "2"),
    BRASIL("+55", "Brasil", "3"),
    ITALIA("+39", "Italy", "4");

    private final String prefix;
    private final String country;
    private final String ID;

    CountryPrefix(String prefix, String country, String ID) {
        this.prefix = prefix;
        this.country = country;
        this.ID = ID;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getCountry() {
        return country;
    }

    public String getID() {
        return ID;
    }
}
