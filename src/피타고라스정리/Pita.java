package 피타고라스정리;

import java.util.Scanner;

public class Pita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("30,000 보다 작은 양의 정수인 테스트 케이스 입력");

        while (true) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) break;

            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;


            if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
