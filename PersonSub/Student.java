package PersonSub;

public class Student extends Person {
    private int credits;

    public Student (String name, String local) {
        super(name, local);
    }

    public void study() {
        this.credits++;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}
