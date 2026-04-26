package PersonSub;

public class Person {
    private final String name;
    private final String local;

    public Person(String name, String local) {
        this.name = name;
        this.local = local;
    }

    @Override
    public String toString() {
        return name + "\n  " + local;
    }
}
