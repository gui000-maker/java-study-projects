package EnumIterator;

import java.util.ArrayList;
import java.util.Iterator;
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
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person.getEducation());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
