package car;

public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); // 싱글톤 패턴
        Car teslarW = factory.createCar(); // 메서드에서 Car 생성
        Car teslarB = factory.createCar();

        System.out.println(teslarW.getCarNum()); // 10001 출력
        System.out.println(teslarB.getCarNum()); // 10002 출력
    }
}
