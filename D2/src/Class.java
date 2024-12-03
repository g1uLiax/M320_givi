import java.util.ArrayList;


public class Class {
    private ArrayList<Student> students;

    public Class() {
        this.students = new ArrayList<>();
    }

    public float getAverage() {
        float totalGrades = 0;
        for(Student student: students) {
            totalGrades += student.getGradeAverage();
        }
        return totalGrades / students.size();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
