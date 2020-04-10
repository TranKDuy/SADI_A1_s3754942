package Header;

public class StudentHeader implements Header {
    @Override
    public void header() {
        System.out.println("---- STUDENT SELECTION ----");
    }

    @Override
    public void endline() {
        System.out.println("----------------------------");
    }
}
