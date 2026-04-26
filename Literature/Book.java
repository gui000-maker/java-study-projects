package Literature;

public class Book implements Comparable<Book> {
    private final String name;
    private final int ageRec;

    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRec() {
        return this.ageRec;
    }

    @Override
    public int compareTo(Book book) {
        if (this.ageRec == book.ageRec) {
            return this.name.compareTo(book.name);
        }
            return this.ageRec - book.ageRec;
    }
}