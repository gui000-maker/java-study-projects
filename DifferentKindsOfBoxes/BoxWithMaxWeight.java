package DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final ArrayList<Item> items;
    private final int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + this.weightOfItems() <= this.capacity) {
            this.items.add(item);
        }
    }

    private int weightOfItems() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item items : this.items) {
            if (items.equals(item))
                return true;
        }
            return false;
    }
}
