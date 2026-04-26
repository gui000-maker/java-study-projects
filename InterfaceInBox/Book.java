package InterfaceInBox;

public class Book implements Packable {
    private final String author;
    private final String name;
    private final double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
