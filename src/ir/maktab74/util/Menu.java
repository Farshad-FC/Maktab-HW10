package ir.maktab74.util;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public void showMainMenu() {
        System.out.print(
                "1: add service\n" +
                        "2: show service list\n" +
                        "3: exit\n" +
                        "plz choose a number: ");
    }

    public void showInvalidInputMessage() {
        System.out.println("Please enter the correct value!!!");
    }

    public void showCorrectNumberMessage() {
        System.out.println("Please enter the correct number!!!");
    }

    public void showServiceList() {
        System.out.print(
                "1: dinner\n" +
                        "2: confrence\n" +
                        "3: room\n" +
                        "plz choose a number: ");
    }

    public void showEnterCustomerFullName() {
        System.out.println("enter the customer first name and last name: ");
    }

    public void showServiceListFile(Scanner scanner) {
        System.out.println("-".repeat(20));
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            Arrays.stream(line).forEach(a -> System.out.print(a + "\t"));
            System.out.println();
        }
        System.out.println("-".repeat(20));
        scanner.close();
    }
}
