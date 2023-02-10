package 객체직렬화예제2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite {
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        menuWrite();
        selectMenu();
    }
    static void menuWrite() {
        map.put("Ame", new CoffeeMenuInfo("Ame", 2500, "Coffee", "커피"));
        map.put("Espresso", new CoffeeMenuInfo("Espresso", 1500, "Coffee", "커피"));
        map.put("Latte", new CoffeeMenuInfo("Latte", 4500, "Coffee", "커피"));
    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴 선택 : ");
            System.out.println("1, 2, 3");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    System.out.println("==== menu =====");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("---------------------------------");
                    }
                    break;
                case 2 :
                    System.out.println("추가 메뉴 : ");
                    String key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("메뉴 이미 존재");
                    }else {
                        System.out.println("가격 :");
                        int price = sc.nextInt();
                        System.out.println("분류: ");
                        String grp = sc.next();
                        System.out.println("설명 : ");
                    }


                case 3 :
            }
        }

    }
}
