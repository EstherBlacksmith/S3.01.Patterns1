package exercise1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        SingletonUndo singleUndo = SingletonUndo.getInstance();
        MenuReading menuReading = new MenuReading(scanner);
        menuReading.menu();
    }
}
