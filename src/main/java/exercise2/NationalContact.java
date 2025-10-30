package exercise2;

import java.util.Objects;

public class NationalContact implements Contacts {
    String name = "";
    String surName = "";
    String secondSurName = "";
    String phoneNumber = "";
    Address address = null;

    public NationalContact(String name, String surName, String secondSurName) {
        this.name = Objects.requireNonNull(name);
        this.surName = Objects.requireNonNull(surName);
        this.secondSurName = Objects.requireNonNull(secondSurName);
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        String phoneNumberAux = Objects.requireNonNull(phoneNumber);

        if (!validatePhoneNumber(phoneNumberAux)) {
            this.phoneNumber = phoneNumberAux;
        } else {
            System.out.println("The phone number " + phoneNumber + " is incorrect");
        }

    }

    @Override
    public boolean validatePhoneNumber(String phoneNumberAux) {

        if (phoneNumberAux.length() != 9) {
            return true;
        }

        if (!phoneNumberAux.startsWith("9")) {
            return true;

        }

        if (phoneNumberAux.matches("/\\D+/")) {
            return true;
        }

        return false;
    }

    public String deletingHyphens(String phoneNumber) {
        return phoneNumber.replace("-", "");

    }
}
