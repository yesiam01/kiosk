package Lv3;

import Lv2.MenuItem;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    ArrayList<MenuItem> menuItems = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

    public void start() {

        while (true) {
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.print((i + 1) + ". " + item.name + " | W " + item.price + " | " + item.explain + "\n");
            }

            System.out.println("메뉴 번호를 선택하세요 ( 0입력시 종료) : ");

            int choose = scanner.nextInt();

            if (choose == 0) {
                System.out.println("프로그램을 종료합니다");
            } else if (choose > 0 && choose <= menuItems.size()) {
                MenuItem selectItem = menuItems.get(choose - 1);
                System.out.println("선택한 메뉴: " + selectItem.name + ", W " + selectItem.price + ", " + selectItem.explain);
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        }
    }
}
