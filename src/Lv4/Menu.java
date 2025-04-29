package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public  List<MenuItem> getMenuItems() {
        return menuItems;
    }

}




