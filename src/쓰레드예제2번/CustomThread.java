package 쓰레드예제2번;

public class CustomThread extends Thread {
    @Override
    public void run() { // Thread 가 실행되는 부분
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("클래스 상속 스레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
