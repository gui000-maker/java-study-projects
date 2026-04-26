package Cube;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface (Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
        }
            int number = Integer.parseInt(input);
            System.out.println(number * number * number);
        }
    }
}