package Header;

public class CourseHeader implements Header{
    @Override
    public void header() {
        System.out.println("----- COURSE SELECTION -----");
    }

    @Override
    public void endline() {
        System.out.println("-----------------------------");
    }
}
