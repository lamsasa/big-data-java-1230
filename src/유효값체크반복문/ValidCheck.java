package 유효값체크반복문;

import java.util.Scanner;
//반복문을 이용해서 유효값 체크하기 (while 반복문 사용)
// do ~ while() : 먼저 수행 후 조건 확인

public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("나이를 입력 하세요 : ");
            age = sc.nextInt();
        }while(age <= 0 || age >= 200);

        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}
