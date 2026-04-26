package LiquidContainers;

import java.util.Scanner;

public class OOPContainers {
    static void main() {
        Container container1 = new Container();
        Container container2 = new Container();
        Container[] containers = {container1, container2};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + containers[0] + "\nSecond: " + containers[1]);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    containers[0].add(amount);
                    break;
                case "move":
                    if (amount > 0) {
                        if (amount > containers[0].contains()) {
                            amount = containers[0].contains();
                        }
                        containers[0].remove(amount);
                        containers[1].add(amount);
                    }
                    break;
                case "remove":
                    if (amount > 0) {
                        containers[1].remove(amount);
                        break;
                    }
                    case "quit":
                    return;
            }
        }
    }
}
