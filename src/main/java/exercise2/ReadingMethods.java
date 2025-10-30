package exercise2;

import java.util.Scanner;

public class ReadingMethods {
    private static Scanner inputScanner;

    public ReadingMethods() {
        inputScanner = new Scanner(System.in);

    }

    protected String readString(String question) {
        String readedString = "";
        System.out.println(question);
        while (readedString.isEmpty()) {
            if (inputScanner.hasNext()) {
                readedString = inputScanner.nextLine().trim();
            }
        }
        return readedString;
    }
}
