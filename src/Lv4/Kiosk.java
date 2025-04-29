package Lv4;

import java.util.Scanner;
import java.util.List;

public class Kiosk {
    List<MenuItem> menuItems;
    Scanner scanner = new Scanner(System.in);

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        while (true) {
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.name + " | W " + item.price + " | " + item.explain);
            }

            System.out.println("메뉴 번호를 선택하세요 ( 0입력시 종료) : ");

            int choose = scanner.nextInt();

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
