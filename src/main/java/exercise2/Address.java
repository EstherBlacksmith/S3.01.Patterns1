package exercise2;

import java.util.Objects;

public class Address {
    String street;
    String number;
    String floor;
    String stair;
    String door;
    String postalCode;
    String city;
    String country;

    public Address() {

    }

    protected void setPostalCode(String postalCode) {
        this.postalCode = Objects.requireNonNull(postalCode);
    }

    protected void setStreet(String street) {
        this.street = Objects.requireNonNull(street);
    }

    protected void setNumber(String number) {
        this.number = Objects.requireNonNull(number);
    }

    protected void setFloor(String floor) {
        this.floor = floor;
    }

    protected void setStair(String stair) {
        this.stair = stair;
    }

    protected void setDoor(String door) {
        this.door = door;
    }

    public void setCity(String city) {
        this.city = Objects.requireNonNull(city);
    }

    public void setCountry(String country) {
        this.country = Objects.requireNonNull(country);
    }

    public boolean validatePostalCode(String postalCode) {
        boolean error = false;

        if (postalCode.length() != 5) {
            error = true;
        }

        if (postalCode.matches("/\\D+/")) {
            error = true;
        }

        return error;
    }
}
