package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("1234", "돌돌이", "234566", 12, true);
        Member mem2 = mem1.getMember();  }
}
