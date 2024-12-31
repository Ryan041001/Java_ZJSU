public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("账户存入" + amount + "元");
    }

    public void withdrawal(double amount) {
        balance -= amount;
        if (balance < 0) {
            balance += amount;
            System.out.println("您的取款金额为" + amount + "元，但是账户余额仅为" + balance + "元，操作不合法！");
        } else {
            System.out.println("取款" + balance + "元成功！");
        }
    }

    public void show_balance() {
        if (balance >= 0) {
            System.out.printf("当前账户余额为：" + balance + "元");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Account ac = new Account(10000);
        ac.deposit(1000);
        ac.withdrawal(12000);
        ac.deposit(50000);
        ac.show_balance();
    }
}
