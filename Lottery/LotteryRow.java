package Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        for (Integer num : this.numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    public void randomizeNumbers() {
        while (this.numbers.size() != 7) {
            Random random = new Random();
            int number = random.nextInt(40) + 1;
            if (!this.containsNumber(number)) {
                this.numbers.add(number);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
