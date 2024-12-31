import java.util.Scanner;

public class MaxNumberFromDigitsWithDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 分离整数部分和小数部分
        String[] parts = input.split("\\.");
        String integerPart = parts[0] + parts[1];

        // 分别对整数部分和小数部分进行计数排序
        int[] countInteger = new int[10];
        for (char c : integerPart.toCharArray()) {
            countInteger[c - '0']++;
        }


        // 构建最大整数部分
        StringBuilder maxNumber = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (countInteger[i] > 0) {
                maxNumber.append(i);
                countInteger[i]--;
            }
        }

        System.out.println(maxNumber);
    }

}
