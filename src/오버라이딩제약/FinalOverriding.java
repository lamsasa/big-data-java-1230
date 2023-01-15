package 오버라이딩제약;
// 오버라이딩은 부모가 가진 메소드를 재정의해서 사용하는 것
// 부모의 class 가 실체가 있는 class 이면, 오버라이딩은 선택 사항
// 부모의 class 에서 메소드 구현 시 상속 받은 자식에서 오버라이딩 할 수 없도록 금지 할 수 있다.
public class FinalOverriding {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("페라링");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        ElectricCar electricCar = new ElectricCar("이브이");
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
    }
}
