package exercise2;

import exercise2.concrete_classes.*;
import exercise2.factories.InternationalFactory;
import exercise2.factories.NationalFactory;
import exercise2.interfaces.AgendaFactoryInterface;

public class Main {
    public static void main(String[] args) {

        AgendaFactoryInterface nationalAgenda = new NationalFactory();
        AgendaApplication nationalAgendaApp = new AgendaApplication(nationalAgenda);

        NationalContact nationalContact = (NationalContact) nationalAgendaApp.createContact("Fulanita", "de Tal");
        nationalContact.setSecondSurName("i Pascual");

        NationalAddress nationalAddress = (NationalAddress) nationalAgendaApp.createAddress("de les flors", "s/n");
        nationalAddress.setStreetType("Carrer");
        nationalAddress.setFloor("2");
        nationalAddress.setDoor("B");

        NationalPhoneNumber nationalPhoneNumber = (NationalPhoneNumber) nationalAgendaApp.createPhoneNumber("4274918");
        nationalPhoneNumber.setPrefixPhoneNumber("93");


        AgendaFactoryInterface internationalAgenda = new InternationalFactory();
        AgendaApplication internationalAgendaApp = new AgendaApplication(internationalAgenda);

        InternationalContact internationalContact = (InternationalContact) internationalAgendaApp.createContact("Fulanita", "de Tal");
        InternationalAddress internationalAddress = (InternationalAddress) internationalAgendaApp.createAddress("de les flors", "s/n");
        nationalAddress.setFloor("2");
        nationalAddress.setDoor("B");

        InternationalPhoneNumber internationalPhoneNumber = (InternationalPhoneNumber) internationalAgendaApp.createPhoneNumber("4274918");

    }
}
