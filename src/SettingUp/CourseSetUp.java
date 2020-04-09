package SettingUp;
import RootClass.Course;
public class CourseSetUp {
    Course course = new Course();

    public CourseSetUp id(String id){
        course.id=id;
        return this;
    }
    public CourseSetUp name(String name){
        course.name=name;
        return this;
    }
    public CourseSetUp credits(int credits){
        course.credits = credits;
        return this;
    }
    public Course build(){
        return course;
    }
}
