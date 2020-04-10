package Menu;
import java.util.ArrayList;
import java.util.List;
public class Menu {
    public static void Show() {
        List<String> menuloop = new ArrayList<>();
        menuloop.add("Please select option you want below");
        menuloop.add("1) Create");
        menuloop.add("2) Check");
        menuloop.add("3) Update");
        menuloop.add("4) Delete");

        MenuLoop menuList = new MenuLoop();
        menuList.menuloop = menuloop;

        while(menuList.hasNext()) {
            System.out.println(menuList.next());
        }
    }
}
