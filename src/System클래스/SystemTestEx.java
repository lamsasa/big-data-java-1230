package System클래스;

import static java.lang.Thread.sleep;

public class SystemTestEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;
        int val = (int) (Math.random() * 1000) + 1; // 1-1000사이 임의값
        for (int i = 0; i < data.length; i++) {
            cnt++;
            sleep(1); // 시간 측정에 대한 지연 요인을 만들기 위한 인위적 추가
            if(val == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        //long timwe2 =
    }
}
