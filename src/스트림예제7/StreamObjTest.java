package 스트림예제7;

import java.util.ArrayList;
import java.util.List;

public class StreamObjTest {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("a", 21, 10000));
        customerList.add(new TravelCustomer("b", 35, 50000));
        customerList.add(new TravelCustomer("c", 27, 20000));
        customerList.add(new TravelCustomer("d", 25, 70000));
        System.out.println("명단 출력");
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        System.out.println("총 금액");
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 비용 : " + total);

        System.out.println("====20세 이상====");
        customerList.stream().filter(c->c.getAge() >= 20)
                .map(c->c.getName())
                .sorted()
                .forEach(s-> System.out.println(s));
    }
}

class TravelCustomer {
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}