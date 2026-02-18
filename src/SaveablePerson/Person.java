package SaveablePerson;

public class Person implements Saveable {
    private String name;
    private String address;


    @Override
    public void save() {
        System.out.println(name + "was saved");
    }

    @Override
    public void delete() {
        this.address = null;
    }

    @Override
    public void load(String address) {
        this.address = address;
    }
}
