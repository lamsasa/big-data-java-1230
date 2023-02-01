package 클래스정렬예제1;

import java.util.TreeSet;

// Comparable? 클래스 정렬을 구현 가능하게 해주는 인터페이스이며, TreeSet 컬렉션에서 사용해야 한다.
// CompareTo() 메소드를 오버라이딩해서 정렬 조건을 구현해야 함
// 정렬 조건은 자신의 객체와 매개변수로 입력 받은 도건으
// 정렬 조건은 양의 정수 값을 반환시 정렬 조건이 됨
// 정렬 조검을 0으로 반환 시 Set 특성으로 해당 객체가 표시되지 않움
public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>();
        ts.add(new CarSort("산타페", 2020, "흰옷"));
        ts.add(new CarSort("Sa", 2017, "Silver"));
        ts.add(new CarSort("b", 2017, "Gold"));
        ts.add(new CarSort("c", 2017, "Silver"));

        System.out.println("생성된 객체의 수 : " +ts.size());
        System.out.println("aa".compareTo("dd"));

        for(CarSort e : ts) {
            System.out.println("차종 : " + e.modelName + "  연식 : " + e.modelYear + "  색상 : " + e.color);
        }
    }
}
