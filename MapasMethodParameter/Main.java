package MapasMethodParameter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }

    static int returnSize(Map<String, String> map) {
        return map.size();
    }
}
