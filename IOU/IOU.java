package IOU;

import java.util.HashMap;
import java.util.Scanner;

public class IOU {
    Scanner scanner;
    HashMap <String, Double> debts = new HashMap<>();

    public IOU(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }
}