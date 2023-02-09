package 구간합구하기;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        long[] sumArr = new long[n]; // 합 배열
        for(int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1] + arr[i]; // S[i] = S[i-1] + A[i] : 구간합 만들기
        }
        int left = 0, right = 0;
        while (x != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            // 구간 합 예상하기 :
            x--;
        }
    }
}
