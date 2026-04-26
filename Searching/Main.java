package Searching;

import java.util.ArrayList;

public class Main {
    static void main() {

    }


    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        int middle;
        int bookId;

        while (begin <= end) {
            middle = (end + begin) / 2;
            bookId = books.get(middle).getId();

            if (bookId == searchedId) {
                return middle;
            } else if (bookId < searchedId) {
                begin = middle +1;
            }
            else {
                end = middle -1;
            }
        }
        return -1;
    }
}
