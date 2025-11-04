package exercise2.concrete_classes;

import exercise2.interfaces.ContactInterface;

import java.util.Objects;

public class NationalContact implements ContactInterface {
    private String name;
    private String firstSurName;
    private String secondSurName;

    public NationalContact(String name, String surname, String secondSurName) {
        this.name = Objects.requireNonNull(name);
        this.firstSurName = Objects.requireNonNull(surname);
        this.secondSurName = Objects.requireNonNullElse(secondSurName, "");
    }

    @Override
    public ContactInterface createContact(String name, String firstSurName) {
        return new NationalContact(name, firstSurName, secondSurName);
    }

    protected void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    protected void setFirstSurName(String firstSurName) {
        this.firstSurName = Objects.requireNonNull(firstSurName);
    }

    public void setSecondSurName(String secondSurName) {
        this.secondSurName = Objects.requireNonNull(secondSurName);
    }
}
