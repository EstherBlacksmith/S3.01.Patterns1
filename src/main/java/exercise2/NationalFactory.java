package exercise2;

public class NationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        String secondSurname = "";
        return new NationalContact(name,surname,secondSurname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new NationalPhoneNumber(phoneNumber);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new NationalAddress(street, streetNum);
    }
}
