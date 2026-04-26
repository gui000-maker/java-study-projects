package LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {
    static void main() {
        int[] containers = {0, 0};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(containers[0] + "/100");
            System.out.println(containers[1] + "/100");

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    if (amount > 0) {
                        containers[0] += amount;
                        if (containers[0] > 100) {
                            containers[0] = 100;
                        }
                    }
                    break;
                case "move":
                    if (amount > 0) {
                        if (amount > containers[0]) {
                            amount = containers[0];
                        }
                        containers[0] -= amount;
                        containers[1] += amount;
                        if (containers[1] > 100) {
                            containers[1] = 100;
                        }
                    }
                    break;
                case "remove":
                    if (amount > 0) {
                        containers[1] -= amount;
                        if (containers[1] < 0)
                            containers[1] = 0;
                    }
                    break;
                case "quit":
                    return;
            }
        }
    }
}