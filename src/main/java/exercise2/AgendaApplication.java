package exercise2;

public class AgendaApplication {
    private AgendaFactory factory;


    public AgendaApplication(AgendaFactory factory) {
        this.factory = factory;
    }

    Contact createContact(String name,String surname) {
      return   this.factory.createContact(name,surname);

    }

    Address createAddress() {
        return this.factory.createAddress();
    }

    PhoneNumber createPhoneNumber() {
        return this.factory.createPhoneNumber();
    }
}
