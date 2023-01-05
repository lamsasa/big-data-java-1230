package 기본프로그램; // 접근제한자(캡슐화)와 연관성이 있다.

// 접근제한자: public, protected, default, private
/*
-여기는 범위 주석 입니다.
-주석? 사람은 이해하고 컴파일러는 무시하는 영역
-저자
-Date
-목적
 */

// 주석처리
// 단축키로 할래>> ctrl+/

public class Sample { //  클래스 이름을 지정, 파일명과 클래스 명이 같아야 한다 & 클래스 이름은 관례상 첫자를 대문자로 사용
    // main 메소드는 프로그램의 시작 위치를 의미하며, JVM이 호출함.
    // void는 메소드 실행 이후의 결과값 반환 타입 중 하나 입니다.
    // {} : 중괄호 : 클래스, 메소드 등의 범위를 결정
    // () : 소괄호 : 메소드의 매개 변수를 넣는 곳
    // [] : 대괄호 : 배열등을 정의 할 때 사용 됨
    public static void main(String[] args) {
        System.out.printf("Hello,Java!");
    }
}
