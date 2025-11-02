package exercise2;

public interface AgendaFactoryInterface {
    ContactInterface createContact(String name, String surname);

    PhoneNumberInterface createPhoneNumber(String phoneNumber);

    AddressInterface createAddress(String street, String streetNum);
}
