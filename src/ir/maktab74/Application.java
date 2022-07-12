package ir.maktab74;

import ir.maktab74.domain.Service;
import ir.maktab74.repository.ServiceRepository;
import ir.maktab74.util.ApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static ApplicationContext context = new ApplicationContext();
    public static File serviceFile = new File("service.txt");
    public static ServiceRepository serviceRepository;
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        loop:while (true) {
            try {
                context.getMenu().showMainMenu();
                int selectedNumber = context.getNumberScanner().nextInt();
                switch (selectedNumber) {
                    case 1:
                        addService();
                        break;
                    case 2:
                        showServiceList();
                        break;
                    case 3:
                        break loop;
                    default:
                        context.getMenu().showCorrectNumberMessage();
                }
            }catch (Exception e) {
                context.getMenu().showInvalidInputMessage();
                context.getNumberScanner().next();
            }
        }
    }

    private static void showServiceList() throws FileNotFoundException {
        Scanner scanner = new Scanner(serviceFile);
        context.getMenu().showServiceListFile(scanner);
        scanner.close();
    }

    private static void addService() throws IOException {
        context.getMenu().showEnterCustomerFullName();
        String input = context.getStringScanner().nextLine();
        String[] fullName = input.split(" ");

        String service;
        int amount=0;
        loop:while (true) {
            try {
                context.getMenu().showServiceList();
                int selectedNumber = context.getNumberScanner().nextInt();
                switch (selectedNumber) {
                    case 1:
                        service = "Dinner";
                        amount = 120;
                        break loop;
                    case 2:
                        service = "Confrence";
                        amount = 220;
                        break loop;
                    case 3:
                        service = "Room";
                        amount = 320;
                        break loop;
                    default:
                        context.getMenu().showCorrectNumberMessage();
                }
            }catch (Exception e) {
                context.getMenu().showInvalidInputMessage();
                context.getNumberScanner().next();
            }
        }

//        serviceRepository.save(
//                serviceFile,
//                new Service(fullName[0], fullName[1], service, amount+"$")
//        );

        FileWriter fileWriter = new FileWriter(serviceFile, true);
        fileWriter.write(input + " " + service + " " + amount + "$\n");
        fileWriter.close();
    }
}
