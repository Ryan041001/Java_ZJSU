package Animal;

public class Bird extends Animal {
    public Bird() {
        super();
    }

    @Override
    public void move() {
        System.out.print("鸟在");
        super.move();
    }

    @Override
    public void breath() {
        System.out.print("鸟在");
        super.breath();
    }

    public void fly() {
        System.out.println("鸟在飞翔...");
    }
}
