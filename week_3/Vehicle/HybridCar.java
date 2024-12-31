package Vehicle;

public class HybridCar extends Car implements Electric {
    @Override
    public void move() {
        System.out.println("用混动发动机在公路上行驶....");
    }

    @Override
    protected String model() {
        return "长城 Tank700";
    }

    @Override
    public void refuel() {
        System.out.println("给混动车加油....");
    }

    @Override
    public void charge() {
        System.out.println("给混动车充电....");
    }

}
