package 인터페이스리모컨;
// 인터페이스?
// 모든 필드는 자동으로 상수(final static)으로 변환
// 모든 메소드는 자동으로 추산 메소드가 된다. (public abstract 가 자동 추가)
// 디폴트 메소드 : 예외적으로 구현부를 가질 수 있으며, 상속 받은 클래스에서 재정의 가능
// 정적 메소드를 포함할 수 있다. (정적 메소드는 객체와 상관 없고 인터페이스 타입으로 사용)

public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의하지 않았지만 정적인 상수(인터페이스 생성 시 만들어지며, 객체는 안 된다)
    int MIN_VOLUME = 0; // 자동으로 final static
    void turnOn(); // 자동으로 public abstract 가 붙음 (인터페이스는 기본적으로 모든 메소드가 추상적이므로)
    void turnOff();
    void setVolume(int volume);
    static void changeBattery(){ // 인터페이스 명으로 접근해야 하며, 상속과는 무관하다
        System.out.println("건전지를 교환합니다.");
    }
    void getInfo();
    // 자바 버전 1.8 이후에 추가 되었으며 예외적으로 메소드의 구현부를 가질 수 있다.
    // 예외처리??
    default void setMute(boolean mute) {
        if (mute) System.out.println("무음");
        else System.out.println("무음 해제");
    }
}
