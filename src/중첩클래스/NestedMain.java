package 중첩클래스;
// 중첩클래스란? 하나의 클래스 내부에 선언된 또 다른 클래스
// 일반적으로 여러 클래스와 관계 시 독립적으로 클래스 선언
// 특별할 때는 특정 클래스와 관계를 맺는 클래스를 내부에 선언
// - 내부 클래스에서 외부 클래스의 멤버 손쉬운 접근 가능
// - 클래스를 논리적으로 묶어서 표현, 코드의 캡슐화 증가
// - 코드의 복잡성 감소

public class NestedMain {
    public static void main(String[] args) {
        A a = new A(); // 먼저 외부 클래스 생성 후, 내부 클래스 생성
        A.B b = a.new B();
        b.testMethod();
    }
}

class A {
    class B {
        void testMethod() {
            System.out.println("중첩 메소드");
        }
    }
}