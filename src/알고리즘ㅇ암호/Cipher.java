package 알고리즘ㅇ암호;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("평문 : ");
        String  standard = sc.next();
        System.out.println("암호화 키 : ");
        String cipher = sc.next();

        char[] cip = cipher.toCharArray();
        char value= 0;

        List<Character> vig = new ArrayList<>();
        for(int i = 0; i < standard.length(); i++) {
            if (standard.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (standard.charAt(i) - (cip[i % cipher.length()] - 'a') - 1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        } for(Character e : vig) System.out.print(e);
    }
}
