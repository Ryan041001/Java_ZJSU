package Computer;

public class SoundCard extends PCI {
    public SoundCard() {
        super();
    }

    @Override
    public void powerOn() {
        super.powerOn();
        System.out.println("声卡");
    }

    @Override
    public void powerOff() {
        super.powerOff();
        System.out.println("声卡");
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("音频");
    }
}
