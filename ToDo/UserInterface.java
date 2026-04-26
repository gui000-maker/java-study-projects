package ToDo;

import java.util.Scanner;

public class UserInterface {
    private final TodoList list;
    private final Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true){
            System.out.print("Command: ");
            String word = scanner.nextLine();

            switch (word) {
                case "stop" -> {
                    return;
                }
                case "add" -> {
                    System.out.print("To add: ");
                    word = scanner.nextLine();
                    list.add(word);
                    continue;
                }
                case "list" -> {
                list.print();
                    continue;
                }
                case "remove" -> {
                    System.out.print("Which one is removed? ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    list.remove(number);
                    continue;
                }
            }
            System.out.println("Unknown command");
        }
    }
}
