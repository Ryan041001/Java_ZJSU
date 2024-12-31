package Computer;

public class Computer {
    public static void powerOn() {
        System.out.println("电脑开机");
    }

    public static void powerOff() {
        System.out.println("电脑关机");
    }

    public static void main(String[] args) {
        PCI gc = new GraphicsCard();
        PCI sc = new SoundCard();
        powerOn();
        gc.powerOn();
        gc.turnOn();
        gc.powerOff();
        sc.powerOn();
        sc.turnOn();
        sc.powerOff();
        powerOff();
    }
}