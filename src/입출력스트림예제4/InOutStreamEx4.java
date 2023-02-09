package 입출력스트림예제4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader 는 문자 스트림 최상위 추상 클래스

public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readData;
        while (true) {
            readData = reader.read(); // 하나의 문자(2 바이트)를 읽어 4byte int 타입 반환
            if (readData == -1) break;
            System.out.println((char)readData)
            ;
        }
    }
}
