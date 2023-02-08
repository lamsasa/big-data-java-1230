package 스트림예제5;
// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 변환
// distinct() : 스트림에서 중복된 요소 제거 후 새 스트림 생성

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
//        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
//        // 스트림에서 홀수 값만 골라냄
//        stream1.filter(n->n % 2 ! = 0).forEach(e-> System.out.println(e + " "));
//        System.out.println();
//        // 스트림에서 중복 요소 제거
//        stream2.distinct().forEach(e-> System.out.println(e + " "));
//
//        Scanner sc = new Scanner(System.in);

        // 스트림 변환 : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이뤄진 새로운 스트림 생성
        Stream<String> stream = Stream.of("ㄱ","ㄴ","ㄷ","ㄹ");
        stream.map(s->s.length()).forEach(System.out::println);

        String[] arr = {"rrrr", "hhhhhhhh", "ddd"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫번째 요소부터 전달된 개수 만큼의 요소로만 이뤄진 새로운 스트림 반환
        // skip() : 해당 스트림의 첫번째 요소부터 전달된 개수 만큼의 요소를 제외하고 출력
        IntStream stream4 = IntStream.range(0, 10);
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        stream4.limit(5).forEach(n-> System.out.print(n + " ")); // 처음부터 5개
        System.out.println();
        stream5.skip(5).forEach(n-> System.out.print(n + " "));
        System.out.println();
        stream6.skip(3).limit(5).forEach(n-> System.out.print(n + " "));
        System.out.println();

        // 스트림 정렬 : 해당 스트림을 주어진 비교자 (comparator) 이용 정렬
        Stream<String> stream7 = Stream.of("ㄱ","ㄴ","ㄷ","ㄹ");
        Stream<String> stream8 = Stream.of("ㄱ","ㄴ","ㄷ","ㄹ");
        stream7.sorted().forEach(s-> System.out.print(s + " "));
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s + " "));
    }
}
