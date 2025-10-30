package exercise2;

import java.util.Objects;

public class NationalAddress implements Address {
    String streetType;
    String street;
    String number;
    String floor;
    String stair;
    String door;
    String postalCode;
    String province;
    String locality;
    String city;
    String country;

    public NationalAddress() { }

    protected void setPostalCode(String postalCode) {
        this.postalCode = Objects.requireNonNull(postalCode);
    }

    protected void setStreet(String street) {
        this.street = Objects.requireNonNull(street);
    }

    protected void setStreetType(String streetType) {
        this.streetType = Objects.requireNonNull(streetType);
    }

    protected void setProvince(String province) {
        this.province = Objects.requireNonNull(province);
    }

    protected void setLocality(String locality) {
        this.locality = Objects.requireNonNull(locality);
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

    protected void setCity(String city) {
        this.city = Objects.requireNonNull(city);
    }

    protected void setCountry(String country) {
        this.country = Objects.requireNonNull(country);
    }

    protected boolean isValidPostalCode(String postalCode) {

        if (postalCode.length() != 5) {
            return false;
        }

        if (postalCode.matches("/\\D+/")) {
            return false;
        }

        return true;
    }


    @Override
    public boolean isValidFormatStringValidator(String stringToValidate) {
        return !stringToValidate.matches("^[A-Za-zÀ-ÿ'-]+");
    }
}
