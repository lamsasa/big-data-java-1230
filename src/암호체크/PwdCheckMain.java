package 암호체크;
// 암호체크
// 암호의 길이는 10 ~ 30자 사이(10<= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수문자가 포함 되어야 한다.
// 특수 문자는 (!, %, _, #, &, +, -, *, /)의 9 개 중 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password" 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료

import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd; // 암호를 입력 받는 변수 생성
        while (true) {
            System.out.println("암호 입력 : ");
            pwd = sc.next();

            if(pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;
        }

        if (pwdCheck.validLength(pwd) == false) {
            System.out.println("Bad Length password");
            continue;
        }
    }
}
