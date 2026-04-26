package GradeStatistics;

import java.util.ArrayList;

public class GradeStatistics {
    private final ArrayList<Integer> statistics;

    public GradeStatistics() {
        this.statistics = new ArrayList<>();
    }

    public void addGrade(int points) {
        statistics.add(points);
    }

    public void printAverages() {
        Average();
        AveragePassing();
        PassPercentage();
        GradeDistribution();
    }

    private void GradeDistribution() {
        int[] gradeCounts = new int[6];

        for (int grade : this.statistics) {
            if (grade < 50) {
                gradeCounts[0]++;
            } else if (grade < 60) {
                gradeCounts[1]++;
            } else if (grade < 70) {
                gradeCounts[2]++;
            } else if (grade < 80) {
                gradeCounts[3]++;
            } else if (grade < 90) {
                gradeCounts[4]++;
            } else {
                gradeCounts[5]++;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (; gradeCounts[i] > 0; gradeCounts[i] -= 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void PassPercentage() {
        int passingCount = 0;

        for (int grade : this.statistics) {
            if (grade >= 50) {
                passingCount++;
            }
        }

        System.out.printf("Pass percentage: %.1f\n", (100.0 * passingCount) / this.statistics.size());
    }

    private void AveragePassing() {
        double sum = 0;
        int passingCount = 0;

        for (int grade : this.statistics) {
            if (grade >= 50) {
                sum += grade;
                passingCount++;
            }
        }

        if (passingCount == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.printf("Point average (passing): %.1f\n", (sum / passingCount));
        }
    }

    private void Average() {
        double sum = 0;

        for (int grade : this.statistics) {
            sum += grade;
        }

        System.out.printf("Point average (all): %.1f\n", (sum / this.statistics.size()));
    }
}