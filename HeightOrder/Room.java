package HeightOrder;

import java.util.ArrayList;

public class Room {
    private final ArrayList<Person> room = new ArrayList<>();

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        return room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }
        Person returnObject = room.getFirst();

        // go through the list
        for (Person psr : room) {
            if (returnObject.getHeight() > psr.getHeight()) {
                returnObject = psr;
            }
        }
        room.remove(returnObject);

        return returnObject;
    }
}
