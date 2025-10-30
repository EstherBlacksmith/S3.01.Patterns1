package exercise2;

public abstract class AddressManager {
    String streetType ;
    String street ;
    String streetNumber;
    String floor;
    String stair ;
    String door ;
    String postalCode ;
    String city ;


    private NationalAddress addressQuestions(String country) {
        streetType = readingMethod.readString("Indicate the type of the street (square,street,road,..)");
        street = readingMethod.readString("Indicate the street");
        streetNumber = readingMethod.readString("Indicate the number of the street");
        floor = readingMethod.readString("Indicate the floor or 0 if doesn't have");
        stair = readingMethod.readString("Indicate the stair or 0 if doesn't have");
        door = readingMethod.readString("Indicate the door or 0 if doesn't have");
      /*  locality =readingMethod.readString("Indicate the locality");
        province = readingMethod.readString("Indicate the province");*/
        postalCode = readingMethod.readString("Indicate the postal code");
        city = readingMethod.readString("Indicate the city");

        NationalAddress address1 = new NationalAddress();

        if (address1.isValidPostalCode(postalCode)) {
            System.out.println("The postal code is incorrect. Please try again");
            return null;

        } else {
            address1.setStreetType(streetType);
            address1.setStreet(street);
            address1.setNumber(streetNumber);
            address1.setDoor(door);
            address1.setFloor(floor);
            address1.setStair(stair);
            address1.setLocality(locality);
            address1.setProvince(province);
            address1.setCity(city);
            address1.setCountry(country);
            address1.setPostalCode(postalCode);
        }

        return address1;
    }
}
