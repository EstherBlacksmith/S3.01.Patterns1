package exercise2;

public class InternationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        return new InternationalContact(name, surname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new InternationalPhoneNumber(phoneNumber);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new InternationalAddress(street, streetNum);
    }

}