import java.util.Scanner;

public class factorial_B {
    public static int f(int n) {
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

    public static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += f(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = sc.nextInt();
        int sum = Sum(num);
        for (int i = 1; i <= num; i++) {
            System.out.println("factorial(" + i + ")=" + f(i));
        }
        System.out.println("阶乘和为：" + sum);
    }
}
