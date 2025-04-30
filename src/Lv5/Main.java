package Lv5;

import Lv4.Kiosk;
import Lv4.Menu;
import Lv4.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Menu burgers = new Menu("Burger");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");

        List<Menu> menuItems = new ArrayList<>();
        menuItems.add(burgers);
        menuItems.add(drinks);
        menuItems.add(desserts);

        Lv4.Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
