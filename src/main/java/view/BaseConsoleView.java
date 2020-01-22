package view;

import java.util.Scanner;

public abstract class BaseConsoleView {

    protected Scanner scanner;

    public BaseConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    protected int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice == -1)
                    System.exit(0);
                if (choice >= min && choice <=max){
                    break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return choice;
    }
}
