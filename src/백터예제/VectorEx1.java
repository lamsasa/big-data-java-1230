package 백터예제;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// 벡터는 어레이리스트와 내부적으로 동일한 구조입니다. 메소드의 사용 방법도 완전히 동일합니다. 멀티 스레드에 안전합니다.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("ㄱ", "010-12", "@", "백", "세봉리"));
        list.add(new NameCard("ㄴ", "010-123", "@", "백", "세봉리"));
        list.add(new NameCard("피", "010-1217", "@", "농", "세봉리"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직업 : " + e.position);
            System.out.println("주소 : " + e.address);
        }
    }
}

class NameCard {
    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}
