package 자동차만들기;

import java.util.Scanner;


public class Car {
    public boolean isOption;
    protected int fuelEff ;
    protected int speed;
    protected int oilSize;
    protected int seat;
    protected String name;

    Car(String name){
        this.name = name;
    }

}

class SportsCar extends Car {
    private boolean isTurbo; // 부가기능 터보

    SportsCar(String name) {
        super(name);
        speed = 250;
        fuelEff = 8;
        oilSize = 30;
        seat = 2;
        isTurbo = false;
    }
    void infoSportCar(){
        System.out.println("====== "+ name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize  );
        System.out.println("좌석수 : " + seat);
        System.out.println("터보기능 : " +isTurbo);
    }

    int getSpeed(){ // Getter.
        this.speed = speed;
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo(){ // Getter.
        return isTurbo;
    }
    void setTurbo(boolean turbo){ // Setter 외부에서 내부에 있는 필드값을 변경
        isTurbo = turbo;
    }
}

class Vehicle extends Car {
    private boolean isTrunk; // 부가기능 트렁크
    Vehicle(String name) {
        super(name);
        speed = 200;
        fuelEff = 12;
        oilSize = 45;
        seat = 4;
    }
    void infoVehicle(){
        System.out.println("====== "+ name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize  );
        System.out.println("좌석수 : " + seat);
        System.out.println("트렁크 : " +isTrunk);
    }
    int getSeat(){ // Getter.
        if(isTrunk) return seat += 1;
        return seat;
    }
    boolean getTrunk(){ // Getter.
        return isTrunk;
    }
    void setTrunk(boolean trunk){ // Setter 외부에서 내부에 있는 필드값을 변경
        isTrunk = trunk;
    }
}

class Bus extends Car {
    private boolean isTank; // 부가기능 연료탱크
    Bus(String name) {
        super(name);
        speed = 150;
        fuelEff = 5;
        oilSize = 100;
        seat = 20;
    }
    void infoBus(){
        System.out.println("====== "+ name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize  );
        System.out.println("좌석수 : " + seat);
        System.out.println("보조연료탱크 : " +isTank);
    }
    int getOilSize(){ // Getter.
        if(isTank) return oilSize += 30;
        return oilSize;
    }
    boolean getTank(){ // Getter.
        return isTank;
    }
    void setTank(boolean tank){ // Setter 외부에서 내부에 있는 필드값을 변경
        isTank = tank;
    }

}