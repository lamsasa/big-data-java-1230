package 두번째숫자찾기;
// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번 째 등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10
// 임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
// 찾을 수 : 5
// 결과 : 6
// 만약에 두 번째에 등장하는 수가 없으면 -1 출력

import java.util.Scanner;

public class SecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num = 0; // 몇 번째 나타나는 수인지 확인
        System.out.print("임의의 수를 입력하시오. : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 입력 받은 각가의 임의의 수를 배열에 대입
        }
        System.out.print("찾아낼 수를 입력하시오. : ");
        int fNum = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == fNum) {
                num++;
                if(num == 2) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        if(num < 2) System.out.println("-1");
    }
}
