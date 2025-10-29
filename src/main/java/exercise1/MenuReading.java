package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuReading {
    private static Scanner inputScanner;

    public MenuReading(Scanner scanner) {
        this.inputScanner = scanner;
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

    protected void menu() {

        String question = "Indicates one of the options:\n" +
                "1. Add a command\n" +
                "2. Delete a command\n" +
                "3. List the last commands\n" +
                "0. Exit";
        int option = 0;

        while (true) {
            option = readInt(question);
            switch (option) {
                case 1 -> {

                    addCommand();
                }
                case 2 -> {
                    deleteCommand();
                }
                case 3 -> {
                    listCommand();
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

    private void deleteCommand() {
        readString("Name the new command");  System.out.println();

    }

    private void listCommand() {
    }

    private void addCommand() {
        System.out.println("Name the comando to delete");
    }
}
