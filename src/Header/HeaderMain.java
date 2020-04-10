package Header;

public class HeaderMain {
    public CourseHeader courseheader;
    public StudentHeader studentheader;

    public HeaderMain() {
        this.courseheader = new CourseHeader();
        this.studentheader = new StudentHeader();
    }

    public void CourseHeaderoutput() {
        courseheader.header();
    }

    public void CourseFooteroutput() {
        studentheader.endline();
    }

    public void StudentHeaderoutput() {
        courseheader.header();
    }

    public void StudentFooteroutput() {
        studentheader.endline();
    }
}

