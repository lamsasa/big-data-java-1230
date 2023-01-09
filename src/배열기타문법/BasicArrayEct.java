package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEct {
    public static void main(String[] args) {
        /* String[] cities = {"서울", "부산", "대구", "인천", "수원"};
        for(String e : cities) System.out.print(e + " ");
        System.out.println();
        System.out.println(cities[3]); // 인천 */
        if(args.length != 2) {
            System.exit(0); // 프로그램을 강제 종료 시킴
        }
        String val1 = args[0];
        String val2 = args[2];
        int num1 = Integer.parseInt(val1); // 입력 받은 문자열을 정수로 변환
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1+ num2));
    }
}
