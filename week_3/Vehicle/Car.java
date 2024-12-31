package Vehicle;

public class Car extends Vehicle implements FuelBased {
    @Override
    public void move() {
        System.out.println("在路上行驶....");
    }

    @Override
    protected String model() {
        return "奔驰 S500";
    }

    @Override
    public void refuel() {
        System.out.println("在加油....");
    }

    public void park() {
        System.out.println("在泊车....");
    }
}
