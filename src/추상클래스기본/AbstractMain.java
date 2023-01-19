package 추상클래스기본;

import java.util.Scanner;

// 추상 클래스란? 실체가 없는(객체가 안 됨) 부모가 상속을 주는 것
// 추상 클래스에는 반드시 추상 메소드가 포함되어야 하고, 해당 메소드는 상속 받은 자식 클래스에서 구현(오버라이딩)
// 추상 클래스의 키워드는 abstract
// 추상 클래스는 일반 메소드, 추상 메소드, 일반 필드 등을 모두 포함할 수 있다.
public class AbstractMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("동물 선택 : [1] 고앵. [2] 댕댕 [3] 오리 : ");
        int sel = sc.nextInt();
        Animal animal = null;
        switch (sel) {
            case 1 :
                animal = new Cat();
            break;

            case 2 :
                animal = new Dog();
                break;

            case 3 :
                animal = new Duck();
                break;
            default:
        }
        animal.cry();
    }
}

abstract class Animal {
    abstract void cry(); // 추상 메소드는 abstract 키워드를 사용하고 반드시 (;)로 끝나야 함
}
class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("냥냥");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("뭉뭉");
    }
}

class Duck extends Animal{

    @Override
    void cry() {
        System.out.println("꽥꽥");
    }
}

