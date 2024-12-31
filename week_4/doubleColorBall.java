import java.util.Random;
import java.util.Scanner;

public class doubleColorBall {
    static Scanner sc = new Scanner(System.in);
    static int k = 0;

    public static void main(String[] args) {
        System.out.println("请输入机选注数：");
        int cnt = sc.nextInt();
        int[][] RedBall = new int[cnt][6];
        int[] BlueBall = new int[cnt];
        Random random = new Random();
        for (k = 0; k < cnt; k++) {
            RedBall[k][0] = random.nextInt(33) + 1;
            for (int i = 1; i < 6; i++) {
                int num = random.nextInt(33) + 1;
                for (int j = 0; j < i; j++) {
                    if (RedBall[k][j] == num) {
                        int temp = random.nextInt(33) + 1;
                        if (num != temp) {
                            RedBall[k][i] = temp;
                        }
                    } else {
                        RedBall[k][i] = num;
                    }
                }
            }
            for (int i = 0; i < 6; i++) {
                for (int j = i; j < 6; j++)
                    if (RedBall[k][i] > RedBall[k][j]) {
                        RedBall[k][i] = RedBall[k][i] ^ RedBall[k][j];
                        RedBall[k][j] = RedBall[k][i] ^ RedBall[k][j];
                        RedBall[k][i] = RedBall[k][i] ^ RedBall[k][j];
                    }
            }
            BlueBall[k] = random.nextInt(16) + 1;
            if (!isDuplicate(RedBall, BlueBall)) {
                // 输出结果
                System.out.printf("第%02d组双色球号码为：", k + 1);
                System.out.print("红球：");
                for (int i = 0; i < 6; i++) {
                    if (RedBall[k][i] >= 10)
                        System.out.print(RedBall[k][i] + " ");
                    else
                        System.out.print("0" + RedBall[k][i] + " ");
                }

            } else {
                int num = BlueBall[k];
                int temp = random.nextInt(16) + 1;
                if (temp != num) {
                    BlueBall[k] = temp;
                }
                System.out.printf("第%02d组双色球号码为：", k + 1);
                System.out.print("红球：");
                for (int i = 0; i < 6; i++) {
                    if (RedBall[k][i] >= 10)
                        System.out.print(RedBall[k][i] + " ");
                    else
                        System.out.print("0" + RedBall[k][i] + " ");
                }
            }
            if (BlueBall[k] >= 10)
                System.out.println("蓝球：" + BlueBall[k]);
            else
                System.out.println("蓝球：0" + BlueBall[k]);
        }

    }

    public static boolean isDuplicate(int[][] RedBall, int[] BlueBall) {
        boolean flag = false;
        int[][] allBall = new int[k + 1][7];
        for (int a = 0, r = 0; a <= k; ++a, ++r) {
            System.arraycopy(RedBall[r], 0, allBall[a], 0, 6);

        }
        for (int a = 0, b = 0; a <= k; ++a, ++b) {
            allBall[a][6] = BlueBall[b];
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 7; j++)
                if (allBall[k][j] == allBall[i][j]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
        }
        return flag;
    }
}