package exercise2;
import java.util.Objects;


public class NationalContact implements Contacts{
    String name = "";
    String surName = "";
    String secondSurName = "";
    String phoneNumber = "";

    public NationalContact( String name, String surName, String secondSurName,String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = Objects.requireNonNull(name);
        this.surName = Objects.requireNonNull(surName);
        this.secondSurName = Objects.requireNonNull(secondSurName);
    }

    @Override
    public void storeContact() {

    }

    @Override
    public void storePhoneNumber() {

    }

    @Override
    public void storeAddress() {

    }

    @Override
    public void getContact() {

    }

    @Override
    public void getPhoneNumber() {

    }

    @Override
    public void getAddress() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void deletePhoneNumber() {

    }

    @Override
    public void deleteAddress() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public void updatePhoneNumber() {

    }

    @Override
    public void updateAddress() {

    }

    @Override
    public boolean validatePhoneNumber() {
        boolean  error = false;

        phoneNumber = phoneNumber.replace("-","");

        if(phoneNumber.length() != 9) {
            error = true;
        }

        if(!phoneNumber.startsWith("9")){
            error = true;
        }

        if(phoneNumber.matches("/\\D+/")){
            error = true;
        }

        return error;
    }

}
