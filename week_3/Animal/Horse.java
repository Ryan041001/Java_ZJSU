package Animal;

public class Horse extends Animal {
    public Horse() {
        super();
    }

    @Override
    public void move() {
        System.out.print("马在");
        super.move();
    }

    @Override
    public void breath() {
        System.out.print("马在");
        super.breath();
    }

    public void run() {
        System.out.println("马在飞奔...");
    }
}
