package Menu;
import java.util.Scanner;

public abstract class Selection {
    public abstract void create();
    public abstract void check();
    public abstract void update();
    public abstract void delete();

    public final void start() {
        Menu.Show();
        System.out.println("Choose option to run the program: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                create();
                break;
            case 2:
                check();
                break;
            case 3:
                check();
                update();
                break;
            case 4:
                check();
                delete();
                break;
        }
    }

}
