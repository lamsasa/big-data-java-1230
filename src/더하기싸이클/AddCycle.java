package 더하기싸이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddCycle {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("(0<=N<=99) N : ");
            int N = Integer.parseInt(br.readLine());
            int num = N;
            int cycle = 0;

            while(true) {
                int a = N%10; // 1의 자리
                int b = N/10; // 10의 자리

                    N = a*10 + (a+b)%10;

                cycle ++;

                if(N==num) break;
            }
            System.out.println("N의 사이클 길이 : " + cycle);

        }

}
