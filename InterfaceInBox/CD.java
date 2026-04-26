package InterfaceInBox;

public class CD implements Packable {
    private final String artist;
    private final String name;
    private final int publishYear;

    public CD(String artist, String name, int publishYear) {
        this.artist = artist;
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publishYear + ")";
     }

    @Override
    public double weight() {
        return 0.1;
    }
}
