package HashMap기본;
// HashMap : 키와 값으로 구성되어 있다. key 의 중복 여부 확인은 HashCode()를 통해 수행
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서 유지 안 함
// 경우에 따라 hashCode()와 equals() 메소드를 오버라이드해서 사용해야 한다.
// HashMap 은 성능에 우수하고 멀티스레드 환경을 지원하지 않음(동기화 기능이 없음)
// HashTable 은 HashMap 내부 구조가 동일하며, 멀티 스레드 지원
// Properties 는 HashTable 을 상속받아 기능을 제약하여 사용 (키와 값이 모두 문자열로만 구성), 정보를 파일에 저장하거나 읽기위한 용도

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("찬", 99);
        map.put("승철", 95);
        map.put("준휘", 95);
        map.put("민규", 97);
        map.put("준휘", 96); // 키가 같기 때문에 값이 이후 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());

        // 객체 찾기
        System.out.println(map.get("준휘"));

        // map 을 순회하는 방법 : 향상된 for 문 사용
        for(String key : map.keySet()) { // 모든 키를 Set 객체에 담아 리턴
            System.out.println(key + " : " + map.get(key));
        }
        // 반복자로 순회하는 방법(iterator)
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) { // 키가 존재하는 지 확인
            String key = iterator.next(); // 키를 가져옴
        }
        // 객체 삭제
        map.remove("민규"); // 키로 Map.Entry 제거
        System.out.println("총 Entry 수 : " + map.size());

        // 값을 수정하는 메소드
        map.replace("승철", 95);

        // map.Entry 전체 삭제
        map.clear();
        map.remove("총 Entry 수 : " + map.size());
    }
}
