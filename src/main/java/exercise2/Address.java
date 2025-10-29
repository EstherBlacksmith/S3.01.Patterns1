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

    public Address(String street, String number, String floor, String stair, String door, String postalCode, String city, String country) {
        this.street = Objects.requireNonNull(street);
        this.number = Objects.requireNonNull(number);
        this.floor = floor;
        this.stair = stair;
        this.door = door;
        this.postalCode = Objects.requireNonNull(postalCode);
        this.city = Objects.requireNonNull(city);
        this.country = Objects.requireNonNull(country);
    }
}
