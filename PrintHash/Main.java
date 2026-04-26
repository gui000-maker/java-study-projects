package PrintHash;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        PrintHash printHash = new PrintHash(scanner);
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printHash.printKeys(hashmap);
        System.out.println("---");
        printHash.printKeysWhere(hashmap, "i");
        System.out.println("---");
        printHash.printValuesOfKeysWhere(hashmap, ".e");
    }
}
