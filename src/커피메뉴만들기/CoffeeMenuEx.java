package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// [1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료
public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }

    void makeMenu() {
        map.put("Ame", new MenuInfo("Ame", 2500, "Coffee", "Basic Coffee"));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "Basic deep Coffee"));
        map.put("Latte", new MenuInfo("Latte", 2500, "Coffee", "Coffee with Milk"));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("메뉴를 선택하십시오 : ");
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료");
            int selMenu = sc.nextInt();
            String key = "";
            switch (selMenu) {
                case 1 :
                    System.out.println("======== 메뉴 보기 ========");
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("-------------------------");
                    }
                    break;
                case 2 :
                    System.out.print("조회 할 메뉴를 입력하시오 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // map 에 키가 존재하는디 확인(있으면 true)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("-------------------------");
                    } else System.out.println("해당 메뉴가 없습니다.");
                    break;
                case 3 :
                    System.out.println("추가 할 메뉴를 입력하세요.");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        //sc.nextInt(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key, new MenuInfo(key, price, grp, desc));
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 메뉴를 입력하시오 : ");
                    break;
                case 5 :
                    System.out.println("수정할 메뉴를 입력하시오 : ");
                    break;
                case 6 :
                    System.out.println("메뉴를 종료합니다.");
                    return; // break 걸면 안되는 이유 : 반복문을 벗어날 수 없다.
            }
        }
    }
}
