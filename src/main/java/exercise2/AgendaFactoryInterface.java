package exercise2;

public interface AgendaFactoryInterface {
    ContactInterface createContact(String name, String surname);

    PhoneNumberInterface createPhoneNumber();

    AddressInterface createAddress();
}
