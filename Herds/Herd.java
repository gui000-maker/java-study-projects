package Herds;

import java.util.List;

public class Herd implements Movable {
    List<Movable> Movables = new java.util.ArrayList<>();

    public void addToHerd(Movable movable) {
        Movables.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : Movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        for (Movable movable : Movables) {
            System.out.println(movable);
        }
            return "";
    }
}
