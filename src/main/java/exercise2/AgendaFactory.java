package exercise2;

public interface AgendaFactory {
    Contact createContact();
    PhoneNumber createPhoneNumber();
    Address createAddress();
}
