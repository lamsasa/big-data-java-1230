package TreeMap기본;

import java.util.Map;
import java.util.TreeMap;

// TreeMap 도 TreeSet 마찬가지로 이진 검색 트리(값이 추가 될 때 정렬이 됨)로 구현 되어 있다.
// Key 값으로 정렬하므로 key 값에 해당하는 Comparable 과 Comparator 를 구현해야 한다.
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(96, "지훈");
        score.put(94, "승철");
        score.put(98, "승관");
        score.put(97, "석민");
        score.put(99, "찬");

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(95);
        System.out.println("95 아래 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(95);
        System.out.println("95 위의 점수 : " + entry.getKey() + " : " + entry.getValue());
    }
}
