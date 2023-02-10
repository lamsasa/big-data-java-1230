package 기본타입보조스트림;
// 기본 타입 보조 스트림 : 바이트 스트림은 바이트 단위로 입출력하기 때문에 자바의 기본 데이터 타입을 사용할 수 없다.
// 이를 해결하기 위해 보조 스트림을 연결해 사용 (DataInputStream, DataOutputStream)


import java.io.*;
import java.util.Date;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("BasicTypeAssiStream.bin");
        DataOutputStream dos = new DataOutputStream(fos); // 프로그램에서 사용 가능한 기본 스트림에 대한 보조 스트림

        dos.writeUTF("기역");  // 문자열 메소드
        dos.writeDouble(99.8); // 실수형 메소드
        dos.writeInt(1);       // 정수형 메소드

        dos.writeUTF("니은");
        dos.writeDouble(98.7);
        dos.writeInt(2);

        dos.writeUTF("디귿");
        dos.writeDouble(78.3);
        dos.writeInt(3);

        dos.flush();
        dos.close();

// 오류
//        FileInputStream fis = new FileInputStream("BasicTypeAssiStream.bin");
//        DataOutputStream dis = new DataOutputStream(fis);
//
//        for (int i = 0; i < 3; i++) {
//            String name = dis.readUTF();
//            double score.txt = dis.readDouble();
//        }
    }
}
