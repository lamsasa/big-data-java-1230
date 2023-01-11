package PC방알바;

import java.util.Scanner;

// PC방에 PC가 100대 (배열의 인덱스는 0 ~ 99),
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면, 거절을 해야 하고, 아니면 자리 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어하는 자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5 => 2(거절 횟수)
// 거절 횟수 출력 : 2
public class PcRoomEx {
    public static void main(String[] args) {
        // PC방 좌석에 대한 100개의 배열이 필요
        int [] seat = new int[99];
        int reject= 0; // 거절 횟수
        int seatNum; // 손님이 원하는 좌석 번호를 입력하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("손님의 수 : ");
        int n =sc.nextInt(); // 손님의 수 입력 받음
        System.out.print("손님이 앉고 싶어하는 자리 번호 : ");
        for(int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if(seat[seatNum - 1] == 1) { // 해당 배열의 값이 1이라는 건 이미 사용 중인 자리다.
                reject++;
            } else {
                seat[seatNum - 1] = 1; //비어 있는 자리를 사용함
            }
        }
        System.out.print("거절 횟수 : ");
        // 배열의 초기 값은 0, 즉, 0이면 비어있는 자리
        System.out.println(reject);
        }
    }
