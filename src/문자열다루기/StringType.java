package 문자열다루기;

import javax.swing.plaf.synth.SynthLookAndFeel;

// equals : 두 개의 문자영ㄹ이 동일한지 비교하여 결과 값을 리턴
public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
//        System.out.println(a.equals(b)); // a의 문자열과 b의 문자열을 비교
//        System.out.println(a.equals(c)); // a와 c 비교
//        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분 안 함
//        System.out.println(a == c); // 이건 문자열 내용을 비교하는 것이 아닌, 문자열의 참조 즉, 주소를 비교하는 것(그래서 이렇게 쓰면 안된다.)
        String d = "Hello J Jav Java";
        // indexOf : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴(앞에 글자가 얼마나 있나)
        //System.out.println(d.indexOf("Java"));

        // contains : 문자열에서 특정 문자열의 포함여부를 리턴
        System.out.println(d.contains("Hello")); // 대소문자 구분함

        // charAt : 특정 위치의 문자를 리턴
        System.out.println(d.charAt(1));

        // replace : 문자열 중 특정 문자열을 다른 문자열로 대체(혹은 삭제) 시 사용
        // replaceAll : 문자열 중 특정 문자열이나 정규식을 다른 문자열로 대체(혹은 삭제) 시 사용
        String language = "Java, Python, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(language.replaceAll("Kotlin", "Jet Brain"));

        //substring : 문자열에서 특정 문자열을 뽑아낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(7)); // 시작 인덱스부터 끝까지 추출
        System.out.println(e.substring(1, 4)); // 시작 인덱스부터 종료 인덱스 미만까지 추출
        // toUpperCase , toLowerCase : 문자열을 모두 대문자 혹은 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim : 문자열 앞과 뒤에 있는 공백 제거
        String str = "   자바 프로그래밍    *!*!*!*!   ";
        System.out.println(str.trim());

        // 문자열 포매팅? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요)
        //System.out.printf("자바 프로그램을 %s 합시다.\n", "열심히");
        String newStr = "";
        int number = 10;
        String day = "three";
        newStr = String.format("자바 프로그램을 %s 합시다.\n", "열심히");
        System.out.println(newStr);

        String newStr2 = "I ate " + number +"apples. so sick for" + day +"days";
        System.out.println(newStr2);

        // toCharArray() : 문자열을 문자 배열 반환
        String name = "람사";
        char[] arrName =name.toCharArray(); // 문자열을 문자로 구성된 배열로 만듦
        System.out.println(name);
        System.out.println(arrName);

        String v = "a:b:c:d";
        String[] result = v.split(":");  // result는 {"a", "b", "c", "d"}
        System.out.println(result);

    }
}
