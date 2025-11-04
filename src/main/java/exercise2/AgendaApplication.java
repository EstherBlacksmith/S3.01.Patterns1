package exercise2;

import exercise2.interfaces.AddressInterface;
import exercise2.interfaces.AgendaFactoryInterface;
import exercise2.interfaces.ContactInterface;
import exercise2.interfaces.PhoneNumberInterface;

public class AgendaApplication {
    private AgendaFactoryInterface factory;

    public AgendaApplication(AgendaFactoryInterface factory) {
        this.factory = factory;
    }

    ContactInterface createContact(String name, String surname) {
        return this.factory.createContact(name, surname);

    }

    AddressInterface createAddress(String street, String streetNum) {
        return this.factory.createAddress(street, streetNum);
    }

    PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return this.factory.createPhoneNumber(phoneNumber);
    }
}
