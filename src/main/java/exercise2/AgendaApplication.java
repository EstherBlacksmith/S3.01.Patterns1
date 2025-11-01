package exercise2;

public class AgendaApplication {
    private AgendaFactory factory;
    private Contact contact;
    private PhoneNumber phoneNumber;
    private Address address;

    public AgendaApplication(AgendaFactory factory) {
        this.factory = factory;
    }

    void createFactory(){
        this.contact = factory.createContact();
        this.phoneNumber = factory.createPhoneNumber();
        this.address = factory.createAddress();
    }

    void createContact(){
        contact.createContact();
    }
}
