package exercise2;

public class InternationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        return new InternationalContact(name,surname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber() {
        return new InternationalPhoneNumber();
    }

    @Override
    public AddressInterface createAddress() {
        return new InternationalAddress();
    }

}
