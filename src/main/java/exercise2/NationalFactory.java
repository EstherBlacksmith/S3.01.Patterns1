package exercise2;

public class NationalFactory implements AgendaFactory {

    @Override
    public Contact createContact() {
        return new NationalContact();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new NationalPhoneNumber();
    }

    @Override
    public Address createAddress() {
        return new NationalAddress();
    }
}
