package 배열로로또번호생성;
// 1~45사이의 임의의 수 6개로 구성
// 1. 배열로 로또 번호를 생성해 출력 하기
// 2. 배열로 로또 번호 샐성(중복 제거)
// 3. 다른 자료구조를 사용해 로도 번호 만들기. (ArrayList, Set)
public class RandomLotto {
    public static void main(String[] args) {
        // 6개의 정수형 배열 생성, 갯수는 6개 (로또 번호 저장 공간)
        int[] lotto = new int[6];
        // 반복문을 만들어 순회하면서 1~45 사이의 임의의 숫자 배열 대입
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) ((Math.random() * 45) + 1);
        }
        // v = (int)((Math.random() * 45) + 1);
        // 배열의 요소를 출력
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + ", ");
        }
        System.out.print("\b\b");
    }
}
