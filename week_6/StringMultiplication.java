import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class StringMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        BigInteger num1 = bigIntegerToInteger(string1);
        BigInteger num2 = bigIntegerToInteger(string2);

        BigInteger res = num1.multiply(num2);

        System.out.println("第一个字符串：" + string1 + " 提取的整数为：" + num1);
        System.out.println("第二个字符串：" + string2 + " 提取的整数为：" + num2);
        System.out.println("从两个字符串：" + string1 + "," + string2 + " 提取的整数的乘积为：" + res);
    }

    private static BigInteger bigIntegerToInteger(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return new BigInteger(stringBuilder.toString());
    }
}
