package 쓰레드예제5번;

// Thread 에서 공통으로 사용하는 클래스 생성
// synchronized : 멀티 스레드환경에서 동시 접속 허용되지 않도록 lock 을 거는 작업을 의미
public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시 정지 상태의 Thread B를 실행 대기 상태로 전환
        try {
            wait(); // Thread A를 일시 정지 상태로 만듦
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시 정지 상태의 Thread A를 실행 대기 상태로 전환
        try {
            wait(); // Thread B를 일시 정지 상태로 만듦
        } catch (InterruptedException e) {}
    }
}
