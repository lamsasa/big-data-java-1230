package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// 상속을 받기 위해서는 extends 사용
// Animal class 로부터 상속을 받아 Dog class 를 생성
// Dog class 에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어 있음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "수면");
    }
}

class HouseDog extends Dog {
    @Override // 어노테이션 : 부가적 정보 표현
    void sleep() {
        System.out.println(name + "집에서 수면");
    }
    // 오버로딩 관계가 성립
    void sleep(int time) {
        System.out.println(name + "이가 " + time + "시간 동안 " + "집에서 잠을 잡니다.");
    }
}