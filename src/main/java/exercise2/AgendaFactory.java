package exercise2;

public interface AgendaFactory {
    Contact createContact(String name, String surname);

    PhoneNumber createPhoneNumber();

    Address createAddress();
}
