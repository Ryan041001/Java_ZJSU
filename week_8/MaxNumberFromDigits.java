import java.util.Scanner;

public class MaxNumberFromDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 计数排序
        int[] count = new int[10];
        for (char c : input.toCharArray()) {
            count[c - '0']++;
        }

        // 构建最大数
        StringBuilder maxNumber = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                maxNumber.append(i);
                count[i]--;
            }
        }

        System.out.println(maxNumber);
    }
}
