package 상속과인터페이스;

import java.util.Scanner;

public class InterfaceEx3 {
    public static void main(String[] args) {
        NetworkAdapter2 adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결 네트워크 선택 1.WiFi 2.5G : ");
        int sel = sc.nextInt();
        if(sel == 1) {
            WiFi wifi = new WiFi("KT", "A");
            wifi.connect();
            wifi.sendMsg();
            wifi.rsvMsg();
        } else {
            FiveG fiveG = new FiveG("SK", "B");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rsvMsg();
        }
    }
}
