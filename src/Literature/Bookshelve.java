package Literature;

import java.util.ArrayList;
import java.util.List;

public class Bookshelve {
    List<Book> books;

    public Bookshelve() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public int bookCount() {
        return this.books.size();
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book.getName() + " (recommended for " + book.getAgeRec() + " year-olds or older)");
        }
    }
}
