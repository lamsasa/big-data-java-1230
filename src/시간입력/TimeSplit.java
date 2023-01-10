package 시간입력;
// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초

import java.util.Scanner;

public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String t = sc.next();
        String[] time = t.split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);

        if(hour > 11) {
            hour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", hour, min, sec);
        } else if(hour <= 12) {
            System.out.printf("오전 %02d시 %02d분 %02d초\n", hour, min, sec);
        }

    }
}
