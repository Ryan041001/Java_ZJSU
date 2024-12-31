package Vehicle;

public class TestVehicles {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        HybridCar hybridCar = new HybridCar();
        car.startEngine(car.model());
        car.move();
        car.refuel();
        car.park();
        bike.startEngine(bike.model());
        bike.move();
        bike.charge();
        bike.balance();
        hybridCar.startEngine(hybridCar.model());
        hybridCar.move();
        hybridCar.refuel();
        hybridCar.charge();
        hybridCar.park();
    }
}
