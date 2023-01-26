package Math클래스;
// Math 클래스의 모든 메소드는 클래스 메소드이므로 객체를 생성하지 않고 바로 사용
// random() : 0.0 ~ 1.0 미만의 임의의  double 형 값을 생성해서 반환
// 7 자리 로또 번호 생성
// 7개의 배열 만들고 첫번째부터
public class MathMainEx {
    public static void main(String[] args) {
        //0 - 99 사잉 임의의 수 생성
        for (int i = 0; i <100; i++) {
            System.out.println((int) (Math.random() * 100));
        }
        // 3 - 8 사이 임의 수 생성하기
        System.out.println((int) (Math.random() * 6) + 3);
        //ceil() : 소수점 이하 무조건 올림
        // round() : 반올림
    }
}
