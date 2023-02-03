package 진수계산;

import java.util.Scanner;

public class TransMainEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("8 진수 입력 : ");
        int oct = sc.nextInt();

        String binary = Integer.toBinaryString(oct);
        System.out.println("출력 값 : " + binary);
    }
}
