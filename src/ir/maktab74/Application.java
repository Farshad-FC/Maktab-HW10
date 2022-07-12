package ir.maktab74;

import ir.maktab74.util.ApplicationContext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static ApplicationContext context = new ApplicationContext();
    //public static File serviceFile = new File("service.txt");
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

    private static void showServiceList() {

    }

    private static void addService() throws IOException {
        context.getMenu().showEnterCustomerFullName();
        String name = context.getStringScanner().nextLine();

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

        File serviceFile = new File("service.txt");
        FileWriter fileWriter = new FileWriter(serviceFile);

        fileWriter.write(name + " " + service + " " + amount + "$\n");
        fileWriter.close();

    }
}
