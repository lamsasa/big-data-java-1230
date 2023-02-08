package 블랙잭;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum = 0;
        int tmp = 0;

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++){
                    sum = arr[i] + arr[j] + arr[k];

                    if(tmp < sum && sum <= M) {
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println("합 : " + tmp);
    }
}
