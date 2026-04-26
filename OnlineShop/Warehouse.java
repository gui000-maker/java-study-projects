package OnlineShop;

import java.util.Map;
import java.util.Set;

public class Warehouse {
    private final Map<String, Integer> productsPrices = new java.util.HashMap<>();
    private final Map<String, Integer> productsStock = new java.util.HashMap<>();

    public void addProduct(String product, int price, int stock) {
        productsPrices.put(product, price);
        productsStock.put(product, stock);
    }

    public int price(String product) {
        if (productsPrices.containsKey(product)) {
            return productsPrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productsStock.containsKey(product)) {
            return productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!(productsStock.containsKey(product)) || productsStock.get(product) == 0) {
            return false;
        }

        productsStock.put(product, productsStock.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        return productsPrices.keySet();
    }
}
