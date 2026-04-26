public class JavaGift {
    static void main() {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
}

class Gift {
    private final String bookName;
    private final int kg;
    
    public Gift (String bookName, int kg) {
    this.bookName = bookName;
    this.kg = kg;
    }

    public String getName() {
        return bookName;
    }

    public int getWeight() {
        return kg;
    }

    public String toString() {
        return bookName + "(" + kg + ")";
    }
}
