package Pay;

public class Main {
    public static void main(String[] args) {
        for(PayEnum payEnum : PayEnum.values()){
            payEnum.display();
        }
    }
}
