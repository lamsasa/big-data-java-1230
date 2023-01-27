package 단어공부;

import java.util.Scanner;

// 알파벳 대소문자로 이뤄진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력, 결과는 대소문자를 구분하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우, ? 로 출력
// 결과 예시 : AaAbcdd => A
// 결과 예시 : ddcfgrG => ?
public class WordStudy {
    public static void main(String[] args) {
        int[] alp = new int [26]; // 알파벳 개수만큼의 배열 생성(가장 많이 등장하는 알파벳을 count 하기 위해)
        int max = 0; // 제일 큰 수 찾기
        char result = 0; // 결과값으로 출력할 알파벳

        Scanner sc = new Scanner(System.in);
        System.out.println("단어 입력 : ");
        String word = sc.next();

        for(int i = 0; i < word.length(); i++) { // 입력 받은 단어의 길이만큼 순회하면 alp 배열에 횟수 누적
            if(word.charAt(i) >= 'a') alp[word.charAt(i) - 'a']++;
            else alp[word.charAt(i) - 'A']++;
        }
        for (int i =0; i < alp.length; i++) {
            if (alp[i] == max) result = '?';
            else if (alp[i] > max) {
                max = alp[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                result = (char) ('A' + i); // 배열의 인덱스에서 'A' 만큼의 값을 증가시켜 실제 대문자 ASCII 값을 구한다.
            }
        }
        System.out.println(result);
    }
}
