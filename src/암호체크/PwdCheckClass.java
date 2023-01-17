package 암호체크;

import java.util.Scanner;

public class PwdCheckClass {
    boolean validLength(String pwd) {
        if(pwd.length() >= 10 && pwd.length() <= 30) return true;
        else return false;
    }


    int[] password = new int[30];
    Scanner sc = new Scanner(System.in);

    public void Password() {
        System.out.print("암호를 입력하시오. : ");
        password = new int[]{sc.nextInt()};
        String password = sc.next();
        char pwd;
        for(int p = 0; p < password.length(); p++){
            pwd = password.charAt(p);
            if(pwd <= 'A') {
                System.out.print((char)(pwd));
            }
        }
    }

}
