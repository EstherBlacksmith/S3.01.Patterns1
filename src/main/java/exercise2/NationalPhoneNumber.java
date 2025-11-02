package exercise2;

import java.util.Objects;

public class NationalPhoneNumber implements PhoneNumberInterface {
    private String phoneNumber;


    public NationalPhoneNumber(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new NationalPhoneNumber(phoneNumber);

    }

}
