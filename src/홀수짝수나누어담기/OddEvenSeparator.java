package 홀수짝수나누어담기;
// 7개의 정수를 입력 받음 (배열 생성 필요)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeparator {
    List<Integer> inList = new ArrayList<>();
    List<Integer> odddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

/*    int[] inPutArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int evenIdx = 0;
    int oddIDx = 0;*/
    // 7개의 정수를 입력 받음
    void inPutArray() {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("7 개의 정수 입력 : ");
        for(int i = 0; i < inPutArr.length; i++) {
            inPutArr[i] = sc.nextInt();*/
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println("정수 입력 : ");
        while (true) {
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value); // ArrayList 값을 추가함
        }
    }
    // 홀수/짝수 나누어 담기
    void separatorArray() {
/*        for(int e : inPutArr) {
            if(e % 2 == 0) oddArr[oddIDx++] = e;
            else evenArr[evenIdx++] = e;*/
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else odddList.add(e);
        }

    }
    // 홀수/짝수 배열 출력
    void printArray() {
/*        System.out.print("홀수 : ");
        for(int i = 0; i < oddIDx; i++) System.out.print(oddArr[i] + " ");
        System.out.println(짝수 : );
        for(int i = 0; i < evenIdx; i++) System.out.print(evenArr[i] + " ");*/
        System.out.print("홀수 : ");
        for(int e : odddList) System.out.print(e + " ");
        System.out.println("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }
}
