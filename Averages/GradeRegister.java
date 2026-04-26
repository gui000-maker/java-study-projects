package Averages;

import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }

        int resultSumns = 0;

        for (int grade : grades) {
            resultSumns += grade;
        }

        return (double) resultSumns / grades.size();
    }

    public double averageOfPoints() {
        if (grades.isEmpty()) {
            return -1;
        }

        int resultSumns = 0;

        for (int point : points) {
            resultSumns += point;
        }

        return (double) resultSumns / points.size();
    }
}