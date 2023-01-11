package 생성자기본연습;
// 생성자란? 클래스가 객체로 만들어 질 때 자동으로 호출(new 호출 시)되며,
// 생성자는 인스턴스 필드를 초기화 하는 것이 주 목적이다.
// 생성자 생성 규칙
// 1. 생성자는 클래스 이름과 같아야 한다.
// 2. 반환 타입(void)은 없고 접근 제한자(public, protect 등)는 올 수 있으나 private 는 특별한 경우가 아니면 사용하지 않는다.
// 3. 하나의 클래스는 여러 생성자를 가질 수 있으나, 오버로딩 생성 규칙에 맞아야 한다.
public class ConstructorEx {
    public static void main(String[] args) {
        Car ev6 = new Car(); // 아무것도 없는 생성자 호출
        Car kona = new Car("코나");
        Car sorento = new Car("소렌토", "2023");
        Car g90 = new Car("제네시스 G90", "2022", "Black");
        ev6.getCar();
        kona.getCar();
        sorento.getCar();
        g90.getCar();
    }
}

class Car {
    String name;
    String year;
    String color;
    Car() {} // 아무것도 없는(매개변수가 없는) 생성자
//    Car() {} //오버로딩 생성 규칙에 맞지 않음 (완전 중복)
    Car(String name) {
        this.name = name;
    }
    Car(String name, String year) {
        this.name = name;
        this.year = year;
    }
    Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    void getCar() {
        System.out.println("이름 : " + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("---------------------");
    }

}
