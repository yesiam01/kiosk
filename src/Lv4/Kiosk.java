package Lv4;

import java.util.Scanner;
import java.util.List;

public class Kiosk {
    List<Menu> menus;
    Scanner scanner = new Scanner(System.in);

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("Main Menu");
            for (int i = 0; i < menus.size(); i++) {
                Menu menu = menus.get(i);
                System.out.println((i + 1) + ". " + menu.getName());
            }

            System.out.print("메뉴 번호를 선택하세요 (0 입력시 종료) : ");
            int choose = scanner.nextInt();

            if (choose == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (choose > 0 && choose <= menus.size()) {
                Menu selectedMenu = menus.get(choose - 1);
                List<MenuItem> menuItems = selectedMenu.getMenuItems();

                System.out.println(selectedMenu.getName() + " 메뉴");
                for (int i = 0; i < menuItems.size(); i++) {
                    MenuItem item = menuItems.get(i);
                    System.out.println((i + 1) + ". " + item.name + " | W " + item.price + " | " + item.explain);
                }

                System.out.print("메뉴 아이템 번호를 선택하세요 (0 입력시 메인으로) : ");

                int itemchoose = scanner.nextInt();
                if (choose == 0) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                } else if (choose > 0 && choose <= menuItems.size()) {
                    MenuItem selectItem = menuItems.get(choose - 1);
                    System.out.println("선택한 메뉴: " + selectItem.name + "| W " + selectItem.price + " | " + selectItem.explain);
                } else {
                    System.out.println("잘못된 번호입니다.");
                }

            }
        }
    }
}
