package Menu;
import Header.TOC;
import RootClass.Course;
import RootClass.Student;
import RootClass.StudentEnrollment;
import Form.Courses;
import Form.Students;

import java.util.Scanner;
public class Interface implements GuidanceLayout {
    public Courses courses;
    public Students students;

    @Override
    public void takeCourseForm(Courses courses) {
        this.courses = courses;
    }

    @Override
    public void takeStudentForm(Students students) {
        this.students = students;
    }

    @Override
    public Scanner UserInput(String Stringprovide) {
        System.out.println(Stringprovide);
        Scanner scan = new Scanner(System.in);
        return scan;
    }

    @Override
    public StudentEnrollment takeStudentEnrollment() {
        TOC table = new TOC();

        table.StudentHeaderoutput();
        students.show();
        table.StudentEndlineoutput();

        table.CourseHeaderoutput();
        courses.show();
        table.CourseEndlineoutput();

        Scanner studentScanner = UserInput("Please select your name.");
        int studentSelection = studentScanner.nextInt();
        Student student = students.find(studentSelection);

        Scanner courseScanner = UserInput("Please select course for enrollment.");
        int courseSelection = courseScanner.nextInt();
        Course course = courses.find(courseSelection);

        Scanner semesterScanner = UserInput("Provide your Semester.");
        String semester = semesterScanner.next();

        return new StudentEnrollment(student, course, semester);
    }
}

