package 쓰레드예제8번;
// daemonThread : 다른 thread 의 작업을 돕는 보조 thread, 다른 thread 가 모두 종료되면 자동 종료
// thread 의 start() 전, setDaemon(true) 설정만 하면 됨.

import static java.lang.Thread.sleep;

public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // daemon thread 설정
        autoSaveThread.start();
        sleep(30000);
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장 함");
    }
    @Override
    public void run(){
        while (true) {
            try{
                sleep(3000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }
}