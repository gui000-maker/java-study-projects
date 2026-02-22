package Numbers;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many random numbers? ");
        int input = scanner.nextInt();
        int[] numbers = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}
