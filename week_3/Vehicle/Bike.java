package Vehicle;

public class Bike extends Vehicle implements Electric {
    @Override
    public void move() {
        System.out.println("在公路上骑行....");
    }

    @Override
    protected String model() {
        return "美利达 超越Ⅱ";
    }

    @Override
    public void charge() {
        System.out.println("给自行车充气....");
    }

    public void balance() {
        System.out.println("使自行车保持平衡....");
    }
}
