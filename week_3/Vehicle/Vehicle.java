package Vehicle;

public abstract class Vehicle {
    public final void startEngine(String vehicle) {
        System.out.println("启动 " + vehicle);
    }

    public abstract void move();

    protected abstract String model();
}
