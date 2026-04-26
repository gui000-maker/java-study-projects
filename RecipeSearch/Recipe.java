package RecipeSearch;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
     ArrayList<String> ingredients = new ArrayList<>();

    public void addName(String name) {
        this.name = name;
    }

    public void addTime(String time) {
        this.time = Integer.parseInt(time);
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
}
