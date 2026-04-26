package PrintHash;

import java.util.HashMap;
import java.util.Scanner;

public class PrintHash {
    Scanner scanner;

    public PrintHash(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public void printKeysWhere(HashMap<String, String> hashmap, String s) {
        for (String key : hashmap.keySet()) {
            if (key.contains(s)) {
                System.out.println(key);
            }
        }
    }

    public void printValuesOfKeysWhere(HashMap<String, String> hashmap, String s) {
        for (String key : hashmap.keySet()) {
            if (key.contains(s)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
