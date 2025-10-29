package exercise2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner inputScanner;
    static HashMap<String, Contacts> contactsAgenda;

    public static void main(String[] args) {
        inputScanner = new Scanner(System.in);
        contactsAgenda = new HashMap<>();
        menu();

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

    private static int readInt(String question) {
        int readedInt;
        System.out.println(question);

        while (true) {
            try {
                readedInt = inputScanner.nextInt();
                if (readedInt < 0) {
                    throw new InputMismatchException("Must be a positive value.\n" + question);
                }
                return readedInt;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect type.\n" + question);
                inputScanner.nextLine();
            }
        }
    }

    protected static void menu() {

        String question = "Indicates one of the options:\n" +
                "1. Add a contact\n" +
                "2. Delete last command\n" +
                "3. List the last commands\n" +
                "0. Exit";
        int option;

        while (true) {
            option = readInt(question);
            switch (option) {
                case 1 -> {
                    addAContact();
                }
                case 2 -> {
                    deleteContact();
                }
                case 3 -> {
                    listContact();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Unexpected value: " + option);
                }
            }
        }
    }

    private static void listContact() {
        contactsAgenda.forEach((name, contacts) ->
        {
            System.out.println(name + " -> " + contacts);
        });
    }

    private static void deleteContact() {
        String name = readString("Indicate the name");
        contactsAgenda.remove(name);
    }

    private static void addAContact() {

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

                  spanishContact.setPhoneNumber(phoneNumber);
                  spanishContact.address = addressQuestions(spanishContact, "ES");
                  try{
                      contactsAgenda.putIfAbsent(surName1, spanishContact);
                  } catch (NullPointerException e) {
                      contactsAgenda.put(surName1, spanishContact);
                  }
              }finally {
                  questionsInAire = false;
              }

            }

        }

    }

    private static Address addressQuestions(Contacts contacts, String country) {
        String street = readString("Indicate the street");
        String streetNumber = readString("Indicate the number of the street");
        String floor = readString("Indicate the floor or 0 if doesn't have");
        String stair = readString("Indicate the stair or 0 if doesn't have");
        String door = readString("Indicate the door or 0 if doesn't have");
        String postalCode = readString("Indicate the postal code");
        String city = readString("Indicate the city");
        return new Address(street, streetNumber, floor, stair, door, postalCode, city, country);
    }


}


