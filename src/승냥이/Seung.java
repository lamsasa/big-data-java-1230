package 승냥이;

import java.util.Scanner;

public class Seung {
    public static void main(String[] args) {
        Seung test = new Seung();
        //test.test();
        //test.test2();
        //test.test3();//버블정렬 ????
        test.test4();//복사
//        System.out.println(args[0]);
//        System.out.println(args[1]);
    }

    void test4() {
        int[] arr1 = {11,22,33,44};

        int[] arr2 = arr1;

        for(int i : arr1) {
            System.out.print(i + "");
        }
        System.out.println();
        for(int i : arr2) {
            System.out.print(i + "");
        }
        System.out.println();
        arr1[0] = 99;
        arr2[2] = 88;

        for(int i : arr1) {
            System.out.print(i + "");
        }
        System.out.println();
        for(int i : arr2) {
            System.out.print(i + "");
        }
        System.out.println();
    }

    void test3() {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i : arr) System.out.print(i + " ");
    }

    void test2 () {
        String a [] = new String[2];
        a[0] = "test";
        a[1] = "ddd";
                //{"123", "abc"};
        System.out.println(a[0]);
        System.out.println(a[1]);
//
//        Scanner sc = new Scanner(System.in);
//        int[] mathScore = new int [3];
//        System.out.println("수학점수");
//        for (int i=0; i<mathScore.length; i++) {
//            System.out.print("수입력 : ");
//            mathScore[i] = sc.nextInt();
//        }
////        int mathA = 90;
////        int mathB = 50;
////        int methC = 70;
//
//        int[] engScore = new int [3];
//        System.out.println("영어점수");
//        for (int i=0; i<engScore.length; i++) {
//            System.out.print("수입력 : ");
//            engScore[i] = sc.nextInt();
//        }
////        int engA = 25;
////        int engB = 100;
////        int engC = 75;
//
////        ystem.out.println("A의 수학성적"+mathA);S
//
//        for(int i=0; i<mathScore.length; i++) {
//            char name ='a';
//
//            switch (i) {
//                case 0:
//                    name ='A';
//                    break;
//                case 1:
//                    name ='B';
//                    break;
//                case 2:
//                    name ='C';
//                    break;
//            }
//            System.out.printf("%c의 수학점수 : %d \n", name, mathScore[i]);
//        }
//
//        System.out.println();
//
//        for(int math : engScore) {
//            System.out.printf("영어점수 : %d ",math);
//        }

    }

    void test () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                if(j >= 1)
                    continue;
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

}
