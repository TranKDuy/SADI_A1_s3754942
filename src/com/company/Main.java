package com.company;

import Form.Courses;
import Form.Students;
import SettingUp.CourseSetUp;
import SettingUp.StudentSetUp;

public class Main {

    public static void main(String[] args) {

        EnrollmentProcess();
    }
    private static void EnrollmentProcess(){
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
    }
}
