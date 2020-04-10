package Menu;
import Form.EnrollmentData;
import RootClass.StudentEnrollment;
import java.util.Scanner;
public class EnrollmentInterface extends Selection{
    private GuidanceLayout guideUsers;
    private EnrollmentData enrollmentData;

    public EnrollmentInterface(EnrollmentData enrollmentData, GuidanceLayout guideUsers) {
        this.enrollmentData = enrollmentData;
        this.guideUsers = guideUsers;
    }

    @Override
    public void create() {
        StudentEnrollment studentEnrollment = guideUsers.takeStudentEnrollment();
        enrollmentData.create(studentEnrollment);
    }

    @Override
    public void check() {
        System.out.println("---- ENROLMENT DETAILS ----");
        enrollmentData.read();
        System.out.println();
    }

    @Override
    public void update() {

        Scanner enrollmentScanner = guideUsers.UserInput("What enrollment do you want to update ?");
        int enrollmentSelection = enrollmentScanner.nextInt();


        StudentEnrollment studentEnrollment = guideUsers.takeStudentEnrollment();
        enrollmentData.update(enrollmentSelection, studentEnrollment);
    }

    @Override
    public void delete() {
        Scanner enrollmentScanner = guideUsers.UserInput("What enrollment do you want to update ?");
        int enrollmentSelection = enrollmentScanner.nextInt();
        enrollmentData.delete(enrollmentSelection);
    }


}
