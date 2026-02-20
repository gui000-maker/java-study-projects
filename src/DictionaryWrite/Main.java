package DictionaryWrite;

public class Main {
    static void main() {
        SaveableDictionary dictionary = new SaveableDictionary("src/DictionaryWrite/words.txt");
        dictionary.load();

// use the dictionary

        dictionary.save();
    }
}
