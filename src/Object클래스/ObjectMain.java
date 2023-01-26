package Object클래스;
// Object Class : 모든 클래스의 조상이 되는 최상위 클래스 (항상 존재하나 숨어 있음)
// toString() : 해당 객체(인스턴스)에 대한 정보를 문자열로 변환 (클래스 정보 @해시코드)
// 정보에 표사되는 해시코드는 객체의 메모리 주소를 이용해 해시 코드 생성
// equals() : 해당 객체와 매개 변수로 전달받은 객체를 비교해 결과 (참조가 동일?)
public class ObjectMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student2));

        student1 = student2;
        System.out.println(student1.equals(student2));
    }
}

class Student extends Object {
    int id;
    String name;
}