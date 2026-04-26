package StudentAndUniversity;

public class Student {
    private String studentID;
    private String name;
    private University university;

    public Student(University university) {
        this.university = university;
    }
}
