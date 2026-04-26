import java.util.ArrayList;

public class PackageGift {
    static void main() {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}

class Package {
    private final ArrayList<Gift> gifts = new ArrayList<>();
    public int totalWeight;

    public void addGift(Gift gift) {
        totalWeight += gift.getWeight();
        this.gifts.add(gift);
    }

    public int totalWeight() {
        return totalWeight;
    }
}