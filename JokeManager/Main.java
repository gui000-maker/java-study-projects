package JokeManager;

import java.util.Scanner;

public class Main {
    static void main() {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}