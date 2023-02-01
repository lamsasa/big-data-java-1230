package 클래스정렬예제1;

public class CarSort implements Comparable<CarSort>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) return 0;
        else if(this.modelYear < o.modelYear) return -1;
        else return 1;
    }
}