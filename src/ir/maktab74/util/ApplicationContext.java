package ir.maktab74.util;

import java.util.Scanner;

public class ApplicationContext {
    private Menu menu = null;

    private Scanner stringScanner = null;

    private Scanner numberScanner = null;

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
}
