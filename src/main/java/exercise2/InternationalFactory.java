package exercise2;

public class InternationalFactory implements AgendaFactory{

    @Override
    public Contact createContact() {
        return new InternationalContact();
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
