package LiquidContainers;

public class Container {
    private int amount = 0;

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        this.amount += amount;
        if (amount > 100) {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    public String toString() {
        return this.amount + "/100";
    }

}
