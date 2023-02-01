package 클래스정렬예제2;
// Comparator? 정렬을 구현하는 데 사용하는 인터페이스
//


import java.util.TreeSet;

public class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new DescendComp());
        ts.add(new Fruit("사과", 30000));
        ts.add(new Fruit("딸기", 50000));
        ts.add(new Fruit("포도", 40000));
        ts.add(new Fruit("배", 10000));

        for(Fruit f : ts) {
            System.out.println("이름 : " + f.name + ", 가격 : " + f.price);
        }
    }
}
