package DictionaryWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    Map<String, String> dictionary;
    String file;

    public SaveableDictionary(String file) {
        dictionary = new java.util.HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            String keyToRemove = null;
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    keyToRemove = entry.getKey();
                    break;
                }
            }
            if (keyToRemove != null) {
                dictionary.remove(keyToRemove);
            }
        }
    }

    public boolean load() {
        File file = new File(this.file);

        try (Scanner fileScanner = new Scanner(file)) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String word = parts[0].trim();
                    String translation = parts[1].trim();
                    dictionary.put(word, translation);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            return false;
        }
    }

    public boolean save() {
        File file = new File(this.file);

        try (Scanner fileScanner = new Scanner(file)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                String line = entry.getKey() + ":" + entry.getValue();
                System.out.println(line);
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            return false;
        }
    }
}
