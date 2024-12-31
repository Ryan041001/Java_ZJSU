package Animal;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Horse horse = new Horse();
        bird.move();
        bird.breath();
        bird.fly();
        horse.move();
        horse.breath();
        horse.run();
    }
}
