import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        int[] a = new int[100];
        Random r = new Random();
        for (int i = 0; i < 1000; ++i) {
            a[r.nextInt(100)]++;
        }
        int cnt = 0;
        for (int k : a) {
            System.out.printf("整数%d出现次数：%d\n", cnt, k);
            cnt++;
        }
    }
}
