import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigNumberMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1 = scanner.nextLine();
        System.out.println("请输入第二个字符串：");
        String str2 = scanner.nextLine();

        BigDecimal num1 = extractAndParseBigDecimal(str1);
        BigDecimal num2 = extractAndParseBigDecimal(str2);

        System.out.println("解析得到的实数1: " + num1);
        System.out.println("解析得到的实数2: " + num2);
        System.out.println("他们的乘积: " + num1.multiply(num2));
    }

    private static BigDecimal extractAndParseBigDecimal(String str) {
        StringBuilder numBuilder = new StringBuilder();
        boolean hasDecimal = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch) || (!hasDecimal && ch == '.')) {
                numBuilder.append(ch);
                if (ch == '.') {
                    hasDecimal = true;
                }
            }
        }

        String numStr = numBuilder.toString();
        if (!numStr.contains(".")) {
            numStr += ".0"; // Ensure there is a decimal point if missing
        } else {
            // Remove trailing zeros after the decimal point
            int decimalIndex = numStr.indexOf('.');
            while (numStr.length() > decimalIndex + 1 && numStr.charAt(numStr.length() - 1) == '0') {
                numStr = numStr.substring(0, numStr.length() - 1);
            }
        }

        // Remove leading zeros before the decimal point
        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < numStr.length() - 1 && numStr.charAt(firstNonZeroIndex) == '0') {
            firstNonZeroIndex++;
        }
        if (firstNonZeroIndex > 0 && numStr.charAt(firstNonZeroIndex) == '.') {
            firstNonZeroIndex--; // Do not remove zero before the decimal point
        }
        if (firstNonZeroIndex > 0) {
            numStr = numStr.substring(firstNonZeroIndex);
        }

        return new BigDecimal(numStr);
    }
}
