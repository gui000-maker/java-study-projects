package RecipeSearch;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    static void main() {
        RecipeBook recipeBook = new RecipeBook();
        Scanner scanner = new Scanner(System.in);
        InputStream input = Main.class.getResourceAsStream("recipes.txt");
        Scanner scanFile = new Scanner(input);

        UserInterface ui = new UserInterface(recipeBook, scanner ,scanFile);
        ui.start();
    }
}