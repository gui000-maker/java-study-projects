package InterfaceInBox;

import java.util.ArrayList;

public class Box implements Packable {
    private final ArrayList<Packable> items = new ArrayList<>();
    private final double maxWeight;

    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {
        if (item.weight() > this.maxWeight) {
            return;
        }

        this.items.add(item);
    }

    public double weight() {
        double weight = 0;

        for (Packable item : this.items) {
            weight += item.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
