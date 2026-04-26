package ToDo;

import java.util.Scanner;

public class Main {
    static void main() {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
