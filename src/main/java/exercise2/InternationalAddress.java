package exercise2;

import java.util.Objects;

public class InternationalAddress implements AddressInterface {

    String street;
    String streetNum;

    public InternationalAddress(String street, String streetNum) {
        this.street = Objects.requireNonNull(street);
        this.streetNum = Objects.requireNonNull(streetNum);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new NationalAddress(street, streetNum);
    }


}
