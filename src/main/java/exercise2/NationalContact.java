package exercise2;
import java.util.Objects;

public class NationalContact implements Contacts{
    String name = "";
    String surName = "";
    String secondSurName = "";
    String phoneNumber = "";
    Address address = null;

    public NationalContact( String name, String surName, String secondSurName) {
        this.name = Objects.requireNonNull(name);
        this.surName = Objects.requireNonNull(surName);
        this.secondSurName = Objects.requireNonNull(secondSurName);
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        String phoneNumberAux =  Objects.requireNonNull(phoneNumber);
        if(!validatePhoneNumber(phoneNumberAux).equalsIgnoreCase("error")){
            this.phoneNumber =phoneNumberAux;
        }else{
            throw new RuntimeException("The phone number " + phoneNumber + " is incorrect");
        }

    }

    @Override
    public boolean validatePhoneNumber() {
        return false;
    }

    @Override
    public void setAddress() {

    }

    @Override
    public void getContactName() {

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
    public void updateContactName() {

    }

    @Override
    public void updatePhoneNumber() {

    }

    @Override
    public void updateAddress() {

    }


    public String validatePhoneNumber(String phoneNumberAux) {

        phoneNumberAux = phoneNumberAux.replace("-","");

        if(phoneNumberAux.length() != 9) {
            return "Error";
        }

        if(!phoneNumberAux.startsWith("9")){
            return "Error";
        }

        if(phoneNumberAux.matches("/\\D+/")){
            return "Error";
        }

        return phoneNumberAux;
    }

}
