package college.main;

import college.student.student;
import college.faculty.faculty;
import college.department.department;
import static college.department.department.collegeName;

public class main {
    public static void main(String[] args) {
        System.out.println("--- " + collegeName + " ---");

        department d = new department();
        d.showDept("Computer Science");

        faculty f = new faculty();
        f.showFaculty("Mr.Tanmay");

        student s = new student();
        s.showStudent("Aadarsh");
    }
}