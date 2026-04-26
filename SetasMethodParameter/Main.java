package SetasMethodParameter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }

    static int returnSize(Set<String> names) {
        return names.size();
    }
}
