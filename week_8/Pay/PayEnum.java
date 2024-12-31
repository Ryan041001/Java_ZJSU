package Pay;

public enum PayEnum {
    CASH("现金支付",1000.00),
    WECHATPAY("微信支付",1999.99),
    ALIPAY("支付宝",6666.66),
    BANKCARD("银行卡",10000.00),
    CREDITCARD("信用卡",8888.88);

    private final Pay pay;

    PayEnum(String type, double amount){
        this.pay = new Pay(type,amount);
    }

    public void display(){
        pay.show();
    }
}
