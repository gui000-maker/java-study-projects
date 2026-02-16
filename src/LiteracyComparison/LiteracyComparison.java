package LiteracyComparison;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class LiteracyComparison {
    public static void main(String[] args) {
        try (Stream<String> literacy = Files.lines(Paths.get("src/LiteracyComparison/literacy.csv"))) {
            literacy.map(row -> row.split(","))
                    .filter(parts -> parts.length == 6)
                    .sorted(Comparator.comparingDouble(parts -> Double.parseDouble(parts[5])))
                    .forEach(parts -> {
                        String country = parts[3];
                        String year = parts[4];
                        String gender = parts[2];
                        String literacyRate = parts[5];
                        System.out.println(country + " (" + year + "), " + gender + ", " + literacyRate);
                    });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}