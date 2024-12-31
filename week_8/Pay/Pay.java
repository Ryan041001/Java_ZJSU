package Pay;

public class Pay implements Message{
    private final String type;
    private final double amount;

    public Pay(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    @Override
    public void show() {
        System.out.println(type + "，支付金额：" + amount);
    }
}
