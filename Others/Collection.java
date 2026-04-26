import java.util.ArrayList;

public class Collection {
    static void main() {
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}

class SimpleCollection {
    private final ArrayList<String> strings = new ArrayList<>();
    private final String className;

    public SimpleCollection (String className) {
        this.className = className;
    }

    public void add(String name) {
        this.strings.add(name);
    }

    public String longest() {
        if (this.strings.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        String returnObject = this.strings.getFirst();

        // go through the list
        for (String str : this.strings) {
            if (returnObject.length() < str.length()) {
                returnObject = str;
            }
        }
        return returnObject;
    }

    @Override
    public String toString() {
        return className;
    }
}
