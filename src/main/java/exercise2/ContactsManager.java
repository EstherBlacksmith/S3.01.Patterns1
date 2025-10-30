package exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class ContactsManager {
    static HashMap<String, Contacts> contactsAgenda;
    private static Scanner inputScanner;

    public ContactsManager() {
        contactsAgenda = new HashMap<>();
        inputScanner = new Scanner(System.in);

    }

    private static Address addressQuestions(String country) {
        String street = readString("Indicate the street");
        String streetNumber = readString("Indicate the number of the street");
        String floor = readString("Indicate the floor or 0 if doesn't have");
        String stair = readString("Indicate the stair or 0 if doesn't have");
        String door = readString("Indicate the door or 0 if doesn't have");

        String postalCode = readString("Indicate the postal code");
        String city = readString("Indicate the city");
        Address address1 = new Address();

        if (address1.validatePostalCode(postalCode)) {
            System.out.println("The postal code is incorrect. Please try again");
            return null;

        } else {
            address1.setStreet(street);
            address1.setNumber(streetNumber);
            address1.setDoor(door);
            address1.setFloor(floor);
            address1.setStair(stair);
            address1.setCity(city);
            address1.setCountry(country);
            address1.setPostalCode(postalCode);
        }


        return address1;
    }

    private static String readString(String question) {
        String readedString = "";
        System.out.println(question);
        while (readedString.isEmpty()) {
            if (inputScanner.hasNext()) {
                readedString = inputScanner.nextLine().trim();
            }
        }
        return readedString;
    }

    protected void listContact() {
        contactsAgenda.forEach((name, contacts) ->
        {
            System.out.println(name + " -> " + contacts);
        });
    }

    protected void deleteContact() {
        String name = readString("Indicate the name");
        contactsAgenda.remove(name);
    }

    protected void createContact() {
        String country = readString("Select the country of your contact:\n1. Spain");
        if (country.equals("1")) {
            NationalContact spanishContact;
            boolean questionsInAire = true;

            while (questionsInAire) {

                try {
                    String name = readString("Indicate the name");
                    String surName1 = readString("Indicate the first surname");
                    String surName2 = readString("Indicate the second surname");

                    spanishContact = new NationalContact(name, surName1, surName2);

                    String phoneNumber = readString("Indicate the phone number for " + name);

                    phoneNumber = spanishContact.deletingHyphens(phoneNumber);
                    spanishContact.validatePhoneNumber(phoneNumber);
                    spanishContact.setPhoneNumber(phoneNumber);

                    spanishContact.address = addressQuestions("Spain");

                    try {
                        contactsAgenda.putIfAbsent(surName1, spanishContact);
                    } catch (NullPointerException e) {
                        contactsAgenda.put(surName1, spanishContact);
                    }

                } finally {
                    questionsInAire = false;
                }

            }

        }

    }


}
