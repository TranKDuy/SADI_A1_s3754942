package Menu;

public class InterfaceConfig {
    public static GuidanceLayout SeekGuidance(String Guidances) {
        if(Guidances.equals("Interface")) {
            return new Interface();
        } else {
            return  null;
        }
    }
}
