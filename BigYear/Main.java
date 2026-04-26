package BigYear;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        DatabaseBird databaseBird = new DatabaseBird();

        UserInterface ui = new UserInterface(scanner, databaseBird);
        ui.start();
    }
}