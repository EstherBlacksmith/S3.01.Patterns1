package exercise2;

import java.util.Objects;

public class NationalPhoneNumber implements PhoneNumberInterface {
    private String phoneNumber;
    private String prefixPhoneNumber;

    public NationalPhoneNumber(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    protected void setPrefixPhoneNumber(String prefixPhoneNumber) {
        this.prefixPhoneNumber = Objects.requireNonNull(prefixPhoneNumber);
    }

    @Override
    public PhoneNumberInterface createPhoneNumber(String phoneNumber) {
        return new NationalPhoneNumber(phoneNumber);
    }

}
