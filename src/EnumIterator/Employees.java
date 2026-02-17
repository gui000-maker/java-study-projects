package EnumIterator;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private final List<Person> employees = new ArrayList<>();

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> people) {
        this.employees.addAll(people);
    }

    public void print() {
        employees.stream().forEach(System.out::println);
    }

    public void print(Education education) {
        employees.stream()
                .filter(p -> p.getEducation() == education)
                .forEach(System.out::println);
    }
}
