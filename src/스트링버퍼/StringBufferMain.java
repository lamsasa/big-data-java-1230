package 스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화 지원 (멀티 쓰레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존 문자열이 수정 됨, 동기화 지원 안됨, 성능 우수
// String : 객체 생성 필요없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추각가 길어지면 성능 저하
// append() : 문자열 추가 시 사용
// insert() : 특정 위치에 문자열을 삽입
// substring() : 문자열을 구간을 정해 잘라냄
public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello, it's me");
        sb.append(" ");
        sb.append("guest");
        sb.insert(0, "to java");
        //sb.delete(1, 3); // 1 번 인덱스부터 3 번 미만 (1, 2 가 해당 된다)

        System.out.println(sb);
        System.out.println(sb.substring(7));
        System.out.println(sb.substring(0,7));

        /*String st = "hello";
        st += " ";
        st += "to me";
        st += " ";
        st += "java";
        System.out.println(st);*/
    }
}
