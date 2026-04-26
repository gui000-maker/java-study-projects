package JokeManager;

import java.util.Scanner;

public class UserInterface {
    JokeManager manager;
    Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }


    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Write the joke to be added: ");
                    String joke = scanner.nextLine();
                    manager.addJoke(joke);
                    continue;
                case "2":
                    System.out.println("Drawing a joke.");
                    String drawJoke = manager.drawJokes();
                    System.out.println(drawJoke);
                    continue;
                case "3":
                    System.out.println("Printing the jokes.");
                    manager.printJokes();
                    continue;
                case "X":
                    return;
            }
        }
    }
}