package KMP문제;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
// https://aged-palm-323.notion.site/3-55dcea99d8d94792b31c8921716f236e#dba756a5d8e64adcb170c5b68b3a2f14
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String name = sc.next();

        // 1번 : split()
/*        String[] splitName = name.split("-");
        for(String e : splitName) {
            System.out.print(e.charAt(0));
        }
        }*/
        // 2번 : 대문자만 골라내기
/*        for(int i = 0; i < name.length(); i++) {
        if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
            System.out.print(name.charAt(i));
        }
        }*/

        // 3번 : 0번째 문자 출력, '-' 다음 문자 출력
 /*       for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }*/

        // 4번 : 문자 배열로 변경 후 대문자 골라내기
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}
