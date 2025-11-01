package exercise2;

public class NationalFactory implements AgendaFactory {

    @Override
    public Contact createContact(String name,String surname) {
        String secondSurname = "";
        return new NationalContact(name,surname,secondSurname);
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
