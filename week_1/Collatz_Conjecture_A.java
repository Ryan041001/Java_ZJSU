import java.util.Scanner;

public class Collatz_Conjecture_A {
    public static int Res(int n) {
        int res;
        if (n % 2 == 0) {
            res = n / 2;
        } else {
            res = n * 3 + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个开始的正整数：");
        int num = sc.nextInt();
        System.out.print(num + ",");
        int length = 1;
        int max_position = 1;
        int current_position = 1;
        int max_num = 1;
        while (Res(num) != 1) {
            if (Res(num) > max_num) {
                max_num = Res(num);
                max_position = current_position;
            }
            num = Res(num);
            System.out.print(num + ",");
            current_position++;
            length++;
        }
        System.out.println("1");
        System.out.println("序列中一共有" + (length + 1) + "个数");
        System.out.println("序列中最大数为" + max_num + ",他出现在序列的第" + (max_position + 1) + "个位置");
    }
}
