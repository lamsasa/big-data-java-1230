package 소수단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("20자 이하의 단어");
        String word = br.readLine();
        int sum = 0;

        for(int i = 0; i <= word.length(); i++) {
            if ((word.charAt(i) > 'a') && (word.charAt(i) < 'z'))
                sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }

        boolean f = true;

        for(int i = 2; i < sum; i++) {
            if(sum % i == 0) f = false;
        }

        if (f) System.out.println("p-w");
        else System.out.println("not p-w");

    }
}
