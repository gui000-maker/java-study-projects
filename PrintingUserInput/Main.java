package PrintingUserInput;

import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<String> Inputs = new java.util.ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            Inputs.add(input);
        }

        String output = Inputs.stream()
                .reduce("", (previous, current) -> previous + current + "\n");
        System.out.print(output);
    }
}
