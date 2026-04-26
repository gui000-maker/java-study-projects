package OnlineShop;

import java.util.Map;

public class ShoppingCart {
    private final Map<String, Item> items = new java.util.HashMap<>();

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
