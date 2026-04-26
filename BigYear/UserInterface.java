package BigYear;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    DatabaseBird databaseBird;

    public UserInterface(Scanner scanner, DatabaseBird databaseBird) {
        this.scanner = new Scanner(System.in);
        this.databaseBird = databaseBird;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String inputLatinName = scanner.nextLine();
                    this.databaseBird.addBird(inputName, inputLatinName);
                    continue;
                case "Observation":
                    System.out.print("Bird? ");
                    String birdName = scanner.nextLine();
                    this.databaseBird.addObservation(birdName);
                    continue;
                case "All":
                    this.databaseBird.printAll();
                    continue;
                case "One":
                    System.out.print("Bird? ");
                    String oneBirdName = scanner.nextLine();
                    this.databaseBird.printOne(oneBirdName);
                    continue;
                case "Quit":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}