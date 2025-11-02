package exercise2;

public class Main {
    public static void main(String[] args) {
        AgendaFactoryInterface nationalAgenda = new NationalFactory();
        AgendaApplication nationalAgendaApp = new AgendaApplication(nationalAgenda);

        NationalContact nationalContact = (NationalContact) nationalAgendaApp.createContact("name", "surname");
        nationalContact.setSecondSurName("surname");

        NationalAddress nationalAddress = (NationalAddress) nationalAgendaApp.createAddress("street","streetNum");
        nationalAddress.setFloor("2");
        nationalAddress.setDoor("B");


        nationalAgendaApp.createPhoneNumber("934274918");

    }
}
