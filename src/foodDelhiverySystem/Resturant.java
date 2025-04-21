package foodDelhiverySystem;
import java.util.ArrayList;
import java.util.List;

public class Resturant {
    private String name;
    private List<String> menu;
    
    public Resturant(String name, List<String> menu) {
        this.name = name;
        this.menu = menu;
    }
    
    public List<String> getMenu() {
        return this.menu;
    }
    
    public boolean hasItem(String item) {
        return menu.contains(item);
    }
}
