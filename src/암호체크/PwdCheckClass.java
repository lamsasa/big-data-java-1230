package 암호체크;

import java.util.Scanner;

public class PwdCheckClass {
    // 길이 체크
    boolean validLength(String pwd) {
        System.out.print("암호를 입력하시오. : ");
        if(pwd.length() >= 10 && pwd.length() <= 30) return true;
        else return false;
    }
    // 숫자 체크
    boolean validNumber(String pwd) {
        for(int i = 0; i < pwd.length(); i++) {
            if(pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
        }
        return false;
    }
    // 소문자 체크
    boolean validLowerAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
            }
            return false;
        }
    // 대문자 체크
    boolean validUpperAlphabet(String pwd){
       for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
       }
       return false;
    }
    // 특수문자 체크
    boolean validRex(String pwd){
        String specialLetter = "!%_&#+-*/";
        for(int i = 0; i < specialLetter.length(); i++) {
            for(int j = 0; j < pwd.length(); j++) {
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;
    }

}



//    int[] password = new int[30];
//    Scanner sc = new Scanner(System.in);
//
//    public void Password() {
//        password = new int[]{sc.nextInt()};
//        String password = sc.next();
//        char pwd;
//        for(int p = 0; p == password.length(); p++){
//            pwd = password.charAt(p);
//            if(pwd <= 'A') {
//                System.out.print((char)(pwd));
//            }
//        }
//    }
