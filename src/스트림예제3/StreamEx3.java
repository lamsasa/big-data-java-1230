package 스트림예제3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로부터 스트림 만들기
public class StreamEx3 {
    public static void main(String[] args) {
        String[] arr = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ"};
        Stream<String> stream1 = Arrays.stream(arr); // 배열로부터 스트림 제작
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 1-3
        stream2.forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 숫자 범위로부터 스트림 만들기
        IntStream stream = IntStream.rangeClosed(1, 100); //
        int sum = stream.map(e->e).sum();
        System.out.println("합계 : " + sum);
    }

}
