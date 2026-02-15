package PositiveNumbers;

import java.util.List;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i > 0)
                .toList();
    }
}
