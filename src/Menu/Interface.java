package Menu;
import Header.HeaderMain;
import RootClass.Course;
import RootClass.Student;
import RootClass.StudentEnrollment;
import Form.Courses;
import Form.Students;

import java.util.Objects;
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
        HeaderMain table = new HeaderMain();

        table.StudentHeaderoutput();
        students.show();
        table.StudentEndlineoutput();

        table.CourseHeaderoutput();
        courses.show();
        table.CourseEndlineoutput();

        Scanner studentScanner = UserInput("What student do you want to select ?");
        int studentSelection = studentScanner.nextInt();
        Student student = students.find(studentSelection);

        Scanner courseScanner = UserInput("What course do you want to enroll ?");
        int courseSelection = courseScanner.nextInt();
        Course course = courses.find(courseSelection);

        Scanner semesterScanner = UserInput("What semester do you in ?");
        String semester = semesterScanner.next();

        return new StudentEnrollment(student, course, semester);
    }
}

