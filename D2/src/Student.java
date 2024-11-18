import java.util.ArrayList;

public class Student {

    private ArrayList<Float> grades;

    private String name;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public float getGradeAverage() {
        float average = 0;
        for(float grade: grades) {
            average += grade;
        }
        return average / grades.size();
    }

    public void addTest(Test t, int points) {
        grades.add(t.calculateGrade(points));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
