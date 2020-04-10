package Menu;
import RootClass.StudentEnrollment;
import Form.Courses;
import Form.Students;
import java.util.Scanner;
public interface GuidanceLayout {
    void takeCourseForm(Courses courses);
    void takeStudentForm(Students students);
    Scanner UserInput(String Stringprovide);
    StudentEnrollment takeStudentEnrollment();
}
