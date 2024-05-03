package s3_01.n2_abstract_factory;

import s3_01.n2_abstract_factory.app.App;
import s3_01.n2_abstract_factory.service.ContactService;
import s3_01.n2_abstract_factory.service.ContactServiceImplement;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactServiceImplement();
        App app = new App(contactService);

        app.run();
    }
}
