package exercise2;

public class NationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        String secondSurname = "";
        return new NationalContact(name,surname,secondSurname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber() {
        return new NationalPhoneNumber();
    }

    @Override
    public AddressInterface createAddress() {
        return new NationalAddress();
    }
}
