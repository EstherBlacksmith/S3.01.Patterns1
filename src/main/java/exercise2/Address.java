package exercise2;

public interface Address extends ContactBook {
    String street = "";
    String streetNum = "";
    String floor = "";
    String stair = "";
    String door = "";
    String city = "";
    String postalCode = "";
    String country = "";

    boolean isValidFormatStringValidator(String stringToValidate);
}
