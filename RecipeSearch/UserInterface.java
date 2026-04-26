package RecipeSearch;

import java.util.Scanner;

public class UserInterface {
    RecipeBook recipeBook;
    Scanner scanner;
    Scanner scanFile;

    public UserInterface(RecipeBook book, Scanner scanner, Scanner scanFile) {
        this.recipeBook = book;
        this.scanner = scanner;
        this.scanFile = scanFile;
    }

    public void start() {
        recipeBook.loadRecipes(scanFile);

        System.out.println("""
                File to read: recipes.txt
                
                Commands:
                list - lists the recipes
                stop - stops the program
                find name - searches recipes by name
                find cooking time - searches recipes by cooking time
                find ingredient - searches recipes by ingredient
                """);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            switch (input) {
                case "list":
                    recipeBook.printRecipes();
                    break;
                case "stop":
                    return;
                    case "find name":
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();
                    recipeBook.searchByName(searchedWord);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxTime = Integer.parseInt(scanner.nextLine());
                    recipeBook.searchByCookingTime(maxTime);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeBook.searchByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}