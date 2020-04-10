package Singleton;
import Form.EnrollmentData;
public class EnrollmentDataSingleton {
    private static EnrollmentData instance = new EnrollmentData();

    private EnrollmentDataSingleton() {

    }

    public static EnrollmentData getInstance() {
        return instance;
    }
}
