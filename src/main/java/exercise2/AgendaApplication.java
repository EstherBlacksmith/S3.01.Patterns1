package exercise2;

public class AgendaApplication {
    private AgendaFactoryInterface factory;


    public AgendaApplication(AgendaFactoryInterface factory) {
        this.factory = factory;
    }

    ContactInterface createContact(String name, String surname) {
      return   this.factory.createContact(name,surname);

    }

    AddressInterface createAddress() {
        return this.factory.createAddress();
    }

    PhoneNumberInterface createPhoneNumber() {
        return this.factory.createPhoneNumber();
    }
}
