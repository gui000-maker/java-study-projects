package Nicknames;

import java.util.HashMap;

public class Main {
    static void main() {
        HashMap <String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
    }
}
