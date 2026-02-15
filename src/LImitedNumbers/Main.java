package LImitedNumbers;

import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<String> Inputs = new java.util.ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            Inputs.add(input);
        }

        String output = Inputs.stream()
                .mapToInt(value -> Integer.valueOf(value))
                .filter(value -> value < 6 && value > 0)
                .mapToObj(String::valueOf)
                .reduce("", (previous, current) -> previous + current + "\n");
        System.out.print(output);
    }
}
