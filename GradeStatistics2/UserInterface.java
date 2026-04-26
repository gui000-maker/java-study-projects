package GradeStatistics2;

import GradeStatistics.GradeStatistics;

import java.util.Scanner;

public class UserInterface {
    private final GradeStatistics statistics;
    private final Scanner scanner;

    public UserInterface(GradeStatistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("-1")) {
                statistics.printAverages();
                break;
            }

            int points = Integer.parseInt(input);
            if (points < 0 || points > 100) {
                continue;
            }

            statistics.addGrade(points);
        }
    }
}