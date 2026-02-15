package AverageofSelectedNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    ArrayList<String> numbers;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.numbers = new ArrayList<>();
    }

    public void start() {
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("p")) {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the numbers: " + average);
        } else if (input.equals("n")) {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
