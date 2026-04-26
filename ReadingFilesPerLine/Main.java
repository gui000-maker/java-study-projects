package ReadingFilesPerLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

    }
    public static List<String> read(String file) {
        List<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }
}
