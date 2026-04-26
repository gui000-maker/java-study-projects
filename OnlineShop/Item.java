package OnlineShop;

public class Item {
    private final String product;
    private int qty;
    private final int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return unitPrice * qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }

}
