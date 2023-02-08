package 함수형프로그램예제1;

// 함수형 프로그램? 자바 8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문과 반복문 사용 금지 등의 특징 가짐
// 람다(Lambda) : 화살표 표현식으로 사용, 생략 가능한 모든 것을 생략하는 것이 기본 원칙
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 불가, 따라서 함수형 인터페이스가 필요
@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

// class MyCalculator implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

//@FunctionalInterface
//interface My FunctionalInterface {
//
//}
public class FunctionEx1 {
    public static void main(String[] args) {
        Calculator mc = (a, b) -> a + b;
        int rst = mc.sum(3, 4);
        System.out.println(rst);
    }
}
