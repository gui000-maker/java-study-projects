package AverageofSelectedNumbers;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner);

        userInterface.start();
    }
}
