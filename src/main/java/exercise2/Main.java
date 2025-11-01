package exercise2;

public class Main {
    public static void main(String[] args) {
        AgendaFactory nationalAgenda = new NationalFactory();

        AgendaApplication agendaApp = new AgendaApplication(nationalAgenda);
    }
}
