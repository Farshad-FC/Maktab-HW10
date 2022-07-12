package ir.maktab74.util;

import ir.maktab74.domain.Service;
import ir.maktab74.repository.ServiceRepository;

import java.io.File;
import java.util.Scanner;

public class ApplicationContext {
    private Menu menu = null;

    private Scanner stringScanner = null;

    private Scanner numberScanner = null;

    private ServiceRepository serviceRepository = new ServiceRepository();

    public Menu getMenu() {
        if (menu == null) {
            this.menu = new Menu();
        }
        return menu;
    }

    public Scanner getStringScanner() {
        if (stringScanner == null) {
            this.stringScanner = new Scanner(System.in);
        }
        return stringScanner;
    }

    public Scanner getNumberScanner() {
        if (numberScanner == null) {
            this.numberScanner = new Scanner(System.in);
        }
        return numberScanner;
    }

    public ServiceRepository getServiceRepository() {
        return serviceRepository;
    }
}
