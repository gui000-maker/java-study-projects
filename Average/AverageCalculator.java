package Average;

import java.util.ArrayList;

public class AverageCalculator {
    private final ArrayList<Integer> numbers;

    public AverageCalculator() {
        this.numbers = new ArrayList<>();
    }

    public void printAverage() {
        int result = 0;
        for (int number : this.numbers) {
            result += number;
        }
        double average = (double) result / this.numbers.size();
        System.out.println("Average: " + (average));
    }

    public void addNumber(int number) {
        numbers.add(number);
    }
}
