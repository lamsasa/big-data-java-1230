package 쓰레드예제1번;

import java.awt.*;

import static java.lang.Thread.sleep;

// sleep() : 실행 중인 thread 를 일정 시간동안 대기 상태로 만듦
// 반복 수행에 대한 시간을 늦출 때나 인터럽트 예외 처릴
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
