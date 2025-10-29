package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuReading menuReading = new MenuReading(scanner);
        menuReading.menu();
    }
}
