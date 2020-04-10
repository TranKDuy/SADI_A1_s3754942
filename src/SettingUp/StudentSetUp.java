package SettingUp;
import RootClass.Student;

import java.util.Date;

public class StudentSetUp {
    Student student = new Student();
    public StudentSetUp id(String id) {
        student.id = id;
        return this;
    }

    public StudentSetUp name(String name) {
        student.name = name;
        return this;
    }

    public StudentSetUp birthdate(String birthdate) {
        student.birthdate = birthdate;
        return this;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student build() {
        return student;
    }
}
