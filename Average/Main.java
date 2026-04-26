package Average;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        AverageCalculator calculator = new AverageCalculator();

        UserInterface ui = new UserInterface(calculator, scanner);
        ui.start();
    }
}
