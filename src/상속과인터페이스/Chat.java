package 상속과인터페이스;

public class Chat {
    Chat() {}
    void sendMsg() {
        System.out.println("메세지 전송");
    }
    void rcvMsg() {
        System.out.println("메세지 수신");
    }
}

class WiFi extends Chat implements NetworkAdapter2 { // 잘못 만든 예시??
    String company;
    String name;

    public WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi 연결");
    }
    void sendMsg() {
        System.out.println(name + "메세지 발신");
    }
    void rsvMsg() {
        System.out.println(name + "메세지 수신");
    }
}

class FiveG extends Chat implements NetworkAdapter2 { // 잘못 만든 예시??
    String company;
    String name;

    public FiveG(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi 연결");
    }
    void sendMsg() {
        System.out.println(name + "메세지 발신");
    }
    void rsvMsg() {
        System.out.println(name + "메세지 수신");
    }
}