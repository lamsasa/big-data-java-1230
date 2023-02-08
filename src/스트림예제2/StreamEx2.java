package 스트림예제2;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("기역", 89));
        list.add(new Student("니은", 99));
        list.add(new Student("디귿", 78));

        list.stream().forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
        double avg = list.stream().mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}