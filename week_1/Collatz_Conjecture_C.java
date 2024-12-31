public class Collatz_Conjecture_C {
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
        long time1 = System.currentTimeMillis();
        int max_num = 1,
                current_position = 1,
                max_n2 = 1,
                max_position2 = 1;
        //每次循环生成num的序列
        for (int num = 1; num <= 1000; num++) {
            current_position = 1;
            int n = num;
            int max_n1 = 1, max_position1 = 1;
            while (Res(n) != 1) {
                if (Res(n) > max_n1) {
                    max_n1 = Res(n);
                    max_position1 = current_position;
                }
                n = Res(n);
                current_position++;
            }
            //更新最大的步数
            if (max_position1 > max_position2) {
                max_num = num;
                max_n2 = max_n1;
                max_position2 = max_position1;
            }
        }
        long time2 = System.currentTimeMillis();
        long time = time2 - time1;
        System.out.println("起始整数为：" + max_num);
        System.out.println("序列中最大数为" + max_n2 + ",达到改最大值需要" + max_position2  + "步");
        System.out.println("运行时间为：" + time + "ms");
    }
}
