package Literature;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    Bookshelve bookShelve;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.bookShelve = new Bookshelve();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            System.out.println();

            Book book = new Book(bookName, ageRec);
            this.bookShelve.add(book);
        }

        System.out.println();
        if (this.bookShelve.bookCount() == 1) {
            System.out.println(this.bookShelve.bookCount() + " book in total.");
        } else {
            System.out.println(this.bookShelve.bookCount() + " books in total.");
        }
        System.out.println();
        System.out.println("Books: ");
        this.bookShelve.printBooks();
    }
}