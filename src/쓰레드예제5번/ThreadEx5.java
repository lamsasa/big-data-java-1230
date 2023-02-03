package 쓰레드예제5번;
// Thread 간의 협업 : wait(), notify(), notifyAll()
// wait() : 현재의 thread 를 일시 정지 상태로 전환 시킴
// notify() :  일시 정지 상태에 있는 thread 를 실행 대기 상태로 전환
// notifyAll() : 일시 정지 된 모든 thread 를 실행 대기로 만듦

public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);
        ThreadA thB = new ThreadA(sharedObject);
        thA.start();
        thB.start();
    }
}
