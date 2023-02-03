package 쓰레드예제6번;

public class InterruptThread extends Thread{
    @Override
    public void run() {
        try{
            while (true) {
                System.out.println("실행중.........................");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println("인터럽트 발생");
        System.out.println();
    }
}
