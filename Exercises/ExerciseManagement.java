package Exercises;

import java.util.ArrayList;

public class ExerciseManagement {

    private final ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted (String exercise) {
        for (Exercise exercisesInList : exercises) {
            if (exercisesInList.getName().equals(exercise)) {
                exercisesInList.setCompleted(true);
            }
        }
    }

    public boolean isCompleted (String exercise) {
        for (Exercise exercisesInList : exercises) {
            if (exercisesInList.getName().equals(exercise)) {
                return exercisesInList.isCompleted();
            }
        }
        return false;
    }
}
