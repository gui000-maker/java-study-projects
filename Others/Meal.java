import java.util.ArrayList;

public class Meal {
    static void main() {
        Menu cardapio = new Menu();
        cardapio.addMeals("carne");
        cardapio.addMeals("lata555");
        cardapio.removeMeals("carne");
        cardapio.printMeals();
    }
}

class Menu {

    private final ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeals(String meal) {
        this.meals.add(meal);
    }

    public void removeMeals(String meal) {
        this.meals.remove(meal);
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
}