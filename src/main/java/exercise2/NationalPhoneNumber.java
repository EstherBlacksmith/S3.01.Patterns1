package exercise2;

import java.util.Objects;

public class NationalPhoneNumber implements PhoneNumbers{

    String phoneNumber = "";

    public NationalPhoneNumber() {
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }


    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() != 9) {
            return false;
        }

        if (!phoneNumber.startsWith("9")) {
            return false;

        }

        if (phoneNumber.matches("^[0-9-]+")) {
            return true;
        }

        return true;
    }

}
