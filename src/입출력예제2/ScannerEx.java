package 입출력예제2;

import java.io.IOException; // 문제가 일어나면 외부에 표기
import java.util.Scanner; // 두 번째로 많이 사용되는 자바

// 콘솔 입력에 대해서
// System.in.read() : 키보드의 입력을 ASCII 코드 값으로 읽어 들인다.
// Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음
public class ScannerEx {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /*while (true) { //반복문
            //int ketCode = System.in.read(); // 예외처리 import java.io.IOException;>>오류가 날 경우, 차후 조치
            try{
                int ketCode = System.in.read();
                System.out.println("KeyCode : " + ketCode);
                if(ketCode == 'q') break;
            } catch(IOException e) {
                e.printStackTrace();
            }*/
        }
    }

