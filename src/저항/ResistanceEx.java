package 저항;

import java.util.Scanner;

// 전자 제품에서는 저항이 들어간다. 처음 색 2개는 저항 값, 마지막은 곱해야하는 값
public class ResistanceEx {
    public static void main(String[] args) {
        // 컬러 값에 대한 문자열 배열 생성
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] mpc = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        int firstNum = 0;
        int secondNum = 0;
        int lastNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        String firstColor = sc.next();
        String secondColor = sc.next();
        String lastColor = sc.next();

        for(int i = 0; i < 10; i++) {
            if(firstColor.equalsIgnoreCase(color[i])) firstNum = num[i];
            if(secondColor.equalsIgnoreCase(color[i])) secondNum = num[i];
            if(lastColor.equalsIgnoreCase(color[i])) lastNum = mpc[i];
        }
        System.out.println((long)((firstNum * 10) + secondNum) * lastNum);
    }
}
