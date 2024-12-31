package Computer;

public class GraphicsCard extends PCI {
    public GraphicsCard() {
        super();
    }

    @Override
    public void powerOn() {
        super.powerOn();
        System.out.println("显卡");
    }

    @Override
    public void powerOff() {
        super.powerOff();
        System.out.println("显卡");
    }

    @Override
    public void turnOn() {
        System.out.print("视频");
        super.turnOn();
        System.out.println();
    }
}
