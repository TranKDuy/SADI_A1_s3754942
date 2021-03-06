package com.company;
import RootClass.Student;
import RootClass.Course;
import Form.Courses;
import Form.Students;
import Form.EnrollmentData;
import SettingUp.CourseSetUp;
import SettingUp.StudentSetUp;
import Menu.GuidanceLayout;
import Menu.InterfaceConfig;
import Menu.EnrollmentInterface;
import Singleton.EnrollmentDataSingleton;
import Users.StartSequence;
import Users.StarSequenceSystem;
import Users.Users;
import java.util.InputMismatchException;
import java.util.Scanner;
import Menu.Message;
public class Main {

    public static void main(String[] args) {
        EnrollmentProcess();
    }
    private static void EnrollmentProcess() {
        String repeat;
        //Sample
        Students students = new Students();
        students.add(new StudentSetUp().id("s3754942").name("Tran Khang Duy").birthdate("28/10/2000").build());
        students.add(new StudentSetUp().id("s3354789").name("Dummy Student").birthdate("xx/mm/yyyy").build());
        Courses courses = new Courses();
        courses.add(new CourseSetUp().id("COSC2440").name("Software Architecture Design and Implementation").credits(12).build());
        courses.add(new CourseSetUp().id("COSC2638").name("Cloud Computing").credits(12).build());
        courses.add(new CourseSetUp().id("COSC2634").name("Building IT Systems").credits(12).build());
        courses.add(new CourseSetUp().id("COSC2174").name("Data communication & Net-Centric Computing").credits(12).build());
        courses.add(new CourseSetUp().id("COSC2500").name("Intro to Computer Systems and Platform Technologies").credits(12).build());
        courses.add(new CourseSetUp().id("COSC2083").name("Introduction to Information Technology").credits(12).build());
        // Guidance Layout.
        GuidanceLayout guidance = InterfaceConfig.SeekGuidance("Guidances");
        guidance.takeStudentForm(students);
        guidance.takeCourseForm(courses);

        // Enrollment Interface
        EnrollmentData enrollmentDataSingleton = EnrollmentDataSingleton.getInstance();
        EnrollmentInterface enrollmentProgram = new EnrollmentInterface(enrollmentDataSingleton, guidance);
        //  message
        Message repeatMessage = (message) -> System.out.println(message);
        Message invalidMessage = (message) -> System.out.println("Invalid: " + message);
        // Main program
        do {
            try {
                StarSequenceSystem StartMessage = new StartSequence();
                StartMessage.invite(new Users());

                Scanner scan = new Scanner(System.in);
                enrollmentProgram.start();
                repeatMessage.print("Would you like to continue? Enter Y to continue or any other key to quit: ");
                repeat = scan.nextLine();
            } catch (InputMismatchException e) {
                invalidMessage.print("Please try again");
                repeat = "Y";
            } catch (IndexOutOfBoundsException e) {
                invalidMessage.print("Further selection are not available");
                repeat = "Y";
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                repeat = "Y";
            }

        } while (repeat.equalsIgnoreCase("Y"));

    }
}

