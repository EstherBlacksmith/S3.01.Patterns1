package exercise2.factories;

import exercise2.interfaces.AddressInterface;
import exercise2.interfaces.AgendaFactoryInterface;
import exercise2.interfaces.ContactInterface;
import exercise2.interfaces.PhoneNumberInterface;
import exercise2.concrete_classes.InternationalAddress;
import exercise2.concrete_classes.InternationalContact;
import exercise2.concrete_classes.InternationalPhoneNumber;

public class InternationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        return new InternationalContact(name, surname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new InternationalPhoneNumber(phoneNumber);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new InternationalAddress(street, streetNum);
    }

}