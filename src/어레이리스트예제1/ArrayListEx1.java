package 어레이리스트예제1;
// List 인터페이스? 배열과 비슷한 구조를 가지면 하위에 ArrayList, Linked Vector 클래스로 구성
// 요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정 필요 없음), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠르며 삽입, 삭제는 느리다.(단, 맨 뒤의 삽입/ 삭제는 빠르다.)
// Vector : ArrayList 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나 ArrayList 보다는 느리다.
// LinkedList : 쿨리적으로 연속된 공간이 아님, 참조로 다음 저장위치를 가리킴. 삽입, 삭제가 매우 빠르나 검색이 느리다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListEx1 {
    public static void main(String[] args) {
        String[] data = {"138", "145", "122", "155"}; // 이미 만들어진 배열
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
/*        ArrayList<String> pitches = new ArrayList<>(); // List 인터페이스로 ArrayList 객체를 참조함
        pitches.add("138"); // ArrayList 마지막에 값 추가 ( 이 때 사이즈가 증가 함)
        pitches.add("129");
        pitches.add("138");
        pitches.add(1, "115"); // 해당 인덱스에 값 추가*/
        pitches.sort(Comparator.naturalOrder()); // 오름차순
        pitches.sort(Comparator.reverseOrder()); // 내림차순

        System.out.println(pitches);
/*        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환함
        //System.out.println(pitches.get(5)); // 없는 인덱스를 전달하면 예외 발생
        System.out.println(pitches.size()); // ArrayList 의 개수 반환
        System.out.println(pitches.contains("142")); // false 출력, 전달된 값이 ArrayList 내에 있는지 확인
        System.out.println(pitches.remove(0)); // 해당 항목을 List 에서 삭제하고 삭제된 요소를 반환함
        System.out.println(pitches.remove("129")); // 해당 항목을 List 에서 삭제하고 결과를 true 또는 false 로 반환*/
    }
}
