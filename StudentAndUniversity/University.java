package StudentAndUniversity;

import java.util.List;

public class University {
    private String name;
    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
