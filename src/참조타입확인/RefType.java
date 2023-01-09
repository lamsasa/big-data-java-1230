package 참조타입확인;
// 참조 변수의 == (같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        /*int x = 0;
        String str = null; // 참조 타입 변수가 객체를 참조하지 않는다는 의미
        int[] intArray = null;*/
        //Integer val = null; // null도 되고 0도 가능
// wrapper class? int-integer
        /*int val2 = val; //NullPointException 발생
        System.out.println(val2);*/
        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3) {
            System.out.println("두 개의 이름에 대한 참조가 같음");
        } else {
            System.out.println("두 개의 이름에 대한 참조가 다름");
        }
        if(name1.equalsIgnoreCase(name3)) {//equals>>그냥 같은가 비교 equalsIgnoreCase>>대소문자 비교
            System.out.println("두 개의 이름의 내용이 같음");
        } else {
            System.out.println("두 개의 이름의 내용이 다름");
        }
    }
}
