package exercise2;

public interface Contacts {
    String phoneNumber = "";
    String name = "";
    String surName = "";
    Address address = null;

    void setPhoneNumber(String phoneNumber);

    boolean validatePhoneNumber(String phoneNumber);
}
