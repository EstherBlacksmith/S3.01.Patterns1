package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ContactsManager contactsManager;
    static NationalAddressManager addressManager;
    private static Scanner inputScanner;

    public static void main(String[] args) {
        inputScanner = new Scanner(System.in);
        contactsManager = new ContactsManager();
        addressManager = new NationalAddressManager();
        menu();

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
                "1. Add or update a contact\n" +
                "2. Delete last contact\n" +
                "3. List the last contacts\n" +
                "0. Exit";
        int option;

        while (true) {
            option = readInt(question);
            switch (option) {
                case 1 -> {
                    contactsManager.createContact();
                }
                case 2 -> {
                    contactsManager.deleteContact();
                }
                case 3 -> {
                    contactsManager.listContact();
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


}


