import College.student.Student;
import College.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudentInfo("Aadarsh", 01);

        System.out.println();

        Faculty f = new Faculty();
        f.displayFacultyInfo("Dr. Krishna", "Computer Science");
    }
}