package 추상메소드;

public class SmartPhone extends Phone {
    SmartPhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모 요청으로 통화 기능 구현");
    }

    @Override
    void internet() {
        System.out.println("인터넷 기능");
    }

}
