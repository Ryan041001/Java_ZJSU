import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class VectorSort {
    public static void main(String[] args) {
        System.out.println("输入一串整数：");
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        Vector<Integer> vector = new Vector<>();

        // 将输入的字符串按照空格分割成字符串数组
        String[] numbersStr = num.split("\\s+");

        // 创建一个整型数组来存储转换后的数字
        int[] numbers = new int[numbersStr.length];

        // 将字符串数组中的每个元素转换为整数，并存储到整型数组中
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
            vector.add(numbers[i]);
        }


        Collections.sort(vector);
        System.out.println("按升序排列\n" + vector);

        vector.sort(Collections.reverseOrder());
        System.out.println("按降序排列\n" + vector);

        vector.sort(Comparator.comparingInt(Math::abs));
        System.out.println("按绝对值升序排列\n" + vector);
    }
}
