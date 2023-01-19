package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 선택 : [1] WiFi, [2]5G, [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new WiFi("KT");
                break;
            case 2 :
                adapter = new WiFi("SKT");
                break;
            case 3 :
                adapter = new WiFi("LG");
                break;
            default:
                System.out.println("네트워크 선택 오류");
        }
        adapter.connect();
    }
}
