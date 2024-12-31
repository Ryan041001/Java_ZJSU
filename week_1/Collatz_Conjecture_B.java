public class Collatz_Conjecture_B {
    public static long Res(long n) {
        long res;
        if (n % 2 == 0) {
            res = n / 2;
        } else {
            res = (long) n * 3 + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        long max_num = 1, length = 1, max_length = 1, current_position = 1, max_n2 = 10000000, max_position2 = 1;
        for (long num = 1; num <= 10000000; num++) {
            long n = num;
            long res;
            long max_n1 = 1, max_position1 = 1;
            while (Res(n) != 1) {
                res = n;
                if (res > max_n1) {
                    max_n1 = res;
                    max_position1 = current_position;
                }
                n = Res(n);
                current_position++;
                length++;
            }
            if (length > max_length) {
                max_num = num;
                max_length = length;
                max_n2 = max_n1;
                max_position2 = max_position1;
            }
            current_position = 1;
        }
        long time2 = System.currentTimeMillis();
        long time = time2 - time1;
        System.out.println("最长序列长度为：" + max_length);
        System.out.println("起始整数为：" + max_num);
        System.out.println("序列中最大数为" + max_n2 + ",他出现在序列的第" + max_position2 + "个位置");
        System.out.println("运行时间为：" + time + "ms");
    }
}
