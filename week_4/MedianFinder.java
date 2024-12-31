import java.util.Scanner;

public class MedianFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数组的大小：");
        int length1 = sc.nextInt();
        System.out.println("请输入第一个数组的元素：（按升序排列）");
        int[] a1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("请输入第二个数组的大小：");
        int length2 = sc.nextInt();
        System.out.println("请输入第二个数组的元素：（按升序排列）");
        int[] a2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] a3 = new int[length1 + length2];
        System.arraycopy(a1, 0, a3, 0, length1);
        System.arraycopy(a2, 0, a3, length1, length2);
        for (int i = 0; i < a3.length; i++) {
            for (int j = i; j < a3.length; j++) {
                if (a3[i] > a3[j]) {
                    a3[i] = a3[i] ^ a3[j];
                    a3[j] = a3[i] ^ a3[j];
                    a3[i] = a3[i] ^ a3[j];
                }
            }
        }
        double ans;
        if (a3.length % 2 == 0) {
            ans = (a3[a3.length / 2 - 1] + a3[a3.length / 2]) / 2.0;
        } else {
            ans = a3[a3.length / 2];
        }
        System.out.printf("两个升序数组的中位数是：%.5f", ans);
    }
}
