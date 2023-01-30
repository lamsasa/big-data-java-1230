package 제네릭응용;

public class Water extends Material{
    public void doPrinting() {
        System.out.println("Water");
    }
    @Override
    public String toString() {
        return "재료는 water 입니다.";
    }
}
