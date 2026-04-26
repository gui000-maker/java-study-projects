package GradeStatistics2;

import GradeStatistics.GradeStatistics;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics statistics = new GradeStatistics();

        UserInterface ui = new UserInterface(statistics, scanner);
        ui.start();
    }
}