package exercise2;

public interface Contacts {
    String phoneNumber = "";
    String name = "";
    String surName = "";
    void storeContact();
    void storePhoneNumber();
    void storeAddress();
    void getContact();
    void getPhoneNumber();
    void getAddress();
    void deleteContact();
    void deletePhoneNumber();
    void deleteAddress();
    void updateContact();
    void updatePhoneNumber();
    void updateAddress();
    boolean validatePhoneNumber();
}
