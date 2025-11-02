package exercise2;

import java.util.Objects;

public class InternationalPhoneNumber implements PhoneNumberInterface {
    private String phoneNumber;

    public InternationalPhoneNumber(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new InternationalPhoneNumber(phoneNumber);

    }
}
