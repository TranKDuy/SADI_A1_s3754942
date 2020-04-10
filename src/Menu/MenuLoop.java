package Menu;
import java.util.ArrayList;
import java.util.List;
public class MenuLoop implements Loop{
    public List<String> menuloop = new ArrayList<>();
    int currentItem = 0;
    @Override
    public boolean hasNext() {
        if(currentItem >= menuloop.size()) {
            currentItem = 0;
            return false;
        }
        return true;
    }
    @Override
    public Object next() {
        return menuloop.get(currentItem++);
    }
}
