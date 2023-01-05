package 반복문연습문제2번;
// 입력 : 5
//*
//* *
//* * *
//* * * *
//* * * * *
import java.util.Scanner;

public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력하세요. : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }
}
