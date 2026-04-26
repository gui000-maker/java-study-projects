package Divisible;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    static void main() {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(2);
            numbers.add(-17);
            numbers.add(-5);
            numbers.add(7);

            ArrayList<Integer> divisible = divisible(numbers);

            divisible.stream()
                    .forEach(num -> System.out.println(num));
    }

    private static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
