package Menu;
import RootClass.StudentEnrollment;
import Form.Courses;
import Form.Students;
import java.util.Scanner;
public interface GuidanceLayout {
    void takeCourseForm(Courses courses);
    void takeStudentForm(Students students);
    Scanner getUserInput(String askString);
    StudentEnrollment takeStudentEnrollment();
}
