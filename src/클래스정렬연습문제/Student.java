package 클래스정렬연습문제;

public class Student implements Comparable<ClassSortEx1>{
    public String name;
    public int score;
    public String stNum;

    public Student(String name, int score, String stNum) {
        this.name = name;
        this.score = score;
        this.stNum = stNum;
    }

    @Override
    public int compareTo(ClassSortEx1 o) {
        return 0;
    }
}
