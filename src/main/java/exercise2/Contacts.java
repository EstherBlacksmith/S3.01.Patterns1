package exercise2;

public interface Contacts {
    String phoneNumber = "";
    String name = "";
    String surName = "";
    Address address = null;

    void setPhoneNumber(String phoneNumber);
    void setAddress();
    void getContactName();
    void getPhoneNumber();
    void getAddress();
    void deleteContact();
    void deletePhoneNumber();
    void deleteAddress();
    void updateContactName();
    void updatePhoneNumber();
    void updateAddress();
    boolean validatePhoneNumber();
}
