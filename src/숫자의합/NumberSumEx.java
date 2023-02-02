package 숫자의합;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        while (true) {
            int sum = 0;
            System.out.println("입력 : ");
            number = sc.next();
            if (number.equals("0000")) break;
            for(int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }
            System.out.println("출력 : "+ sum);
        }
    }
}
