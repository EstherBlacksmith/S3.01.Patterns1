package exercise2;

public class Main {
    public static void main(String[] args) {
        AgendaFactory nationalAgenda = new NationalFactory();

        AgendaApplication nationalAgendaApp = new AgendaApplication(nationalAgenda);
        NationalContact nationalContact = (NationalContact) nationalAgendaApp.createContact("name","surname");
        nationalContact.setSecondSurName("surname");


        nationalAgendaApp.createPhoneNumber();
        nationalAgendaApp.createAddress();
    }
}
