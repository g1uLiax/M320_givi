import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class defaultClass = new Class();
        String action = "s";
        while(action.equals("s")) {
            action = "t";
            System.out.println("Add student:");

            System.out.println("Student name:");
            String name = scanner.next();
            Student student = new Student(name);
            defaultClass.addStudent(student);

            System.out.println("add test:");
            while(action.equals("t")) {
                System.out.println("achieved points:");
                int achieved = scanner.nextInt();
                System.out.println("total points:");
                int total = scanner.nextInt();
                student.addTest(new Test(total), achieved);
                System.out.println("t to add another test");
                action = scanner.next();
            }
            System.out.println("s to add another student\na to class average grade\nx to exit");
            action = scanner.next();
            if(action.equals("a")) {
                System.out.println("Class average: " + defaultClass.getAverage());
                System.out.println("s to add student\nx to exit");
                action = scanner.next();
            }
        }
    }
}
