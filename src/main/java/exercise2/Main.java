package exercise2;

public class Main {
    public static void main(String[] args) {
        AgendaFactoryInterface nationalAgenda = new NationalFactory();

        AgendaApplication nationalAgendaApp = new AgendaApplication(nationalAgenda);
        NationalContact nationalContact = (NationalContact) nationalAgendaApp.createContact("name","surname");
        nationalContact.setSecondSurName("surname");


        nationalAgendaApp.createPhoneNumber();
        nationalAgendaApp.createAddress();
    }
}
