package 상속실습예제;

public class Person {
    int age;
    int sleep;

    public int getAge() {
        return age;
    }

    public int getSleep() {
        return sleep;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}
class Worker extends Person {
    int work;

    public void setWork(int work) {
        this.work = work;
    }

    public int getWork() {
        return work;
    }
}
class Student extends Person {
    int study;
    void setStudy(int study) {
        this.study = study;
    }
    public String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }
}