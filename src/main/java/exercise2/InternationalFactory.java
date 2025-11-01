package exercise2;

public class InternationalFactory implements AgendaFactory {

    @Override
    public Contact createContact(String name,String surname) {
        return new InternationalContact(name,surname);
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new InternationalPhoneNumber();
    }

    @Override
    public Address createAddress() {
        return new InternationalAddress();
    }

}
