import java.util.Scanner;
import java.math.BigInteger;

public class Mersenne_number {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入素数的上限：");
        int n = sc.nextInt();
        System.out.println("梅森素数（2^p - 1），其中p是素数：");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                BigInteger m = BigInteger.valueOf(2).pow(i).subtract(BigInteger.ONE);
                if (m.isProbablePrime(1))
                    System.out.println("p = " + i + ": M(" + i + ") = 2 ^" + i + "- 1 =" + m);
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("程序运行时间为：" + (time2 - time1) + "ms");
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
