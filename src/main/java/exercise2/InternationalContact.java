package exercise2;

import java.util.Objects;

public class InternationalContact implements ContactInterface {
    String name;
    String surname;

    public InternationalContact(String name, String surname) {
        this.name = Objects.requireNonNull(name);
        this.surname = Objects.requireNonNull(surname);

    }

    @Override
    public ContactInterface createContact(String name, String surname) {
        return new InternationalContact(name, surname);

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = Objects.requireNonNull(surname);
    }
}
