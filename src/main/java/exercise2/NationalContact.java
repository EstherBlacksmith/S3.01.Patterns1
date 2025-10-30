package exercise2;

import java.util.Objects;

public class NationalContact implements Contacts {
    String name = "";
    String surName = "";
    String secondSurName = "";
    NationalPhoneNumber phoneNumber;
    NationalAddress address = null;

    public NationalContact(String name, String surName, String secondSurName) {
        this.name = Objects.requireNonNull(name);
        this.surName = Objects.requireNonNull(surName);
        this.secondSurName = Objects.requireNonNull(secondSurName);
    }



}
