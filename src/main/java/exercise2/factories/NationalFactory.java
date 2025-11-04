package exercise2.factories;

import exercise2.interfaces.AddressInterface;
import exercise2.interfaces.AgendaFactoryInterface;
import exercise2.interfaces.ContactInterface;
import exercise2.interfaces.PhoneNumberInterface;
import exercise2.concrete_classes.NationalAddress;
import exercise2.concrete_classes.NationalContact;
import exercise2.concrete_classes.NationalPhoneNumber;

public class NationalFactory implements AgendaFactoryInterface {

    @Override
    public ContactInterface createContact(String name, String surname) {
        String secondSurname = "";
        return new NationalContact(name, surname, secondSurname);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new NationalPhoneNumber(phoneNumber);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new NationalAddress(street, streetNum);
    }
}
