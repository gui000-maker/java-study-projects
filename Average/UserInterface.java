package Average;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final AverageCalculator calculator;

    public UserInterface(AverageCalculator calculator, Scanner scanner) {
        this.calculator = calculator;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                calculator.printAverage();
                break;
            }

            calculator.addNumber(number);
        }
    }
}
