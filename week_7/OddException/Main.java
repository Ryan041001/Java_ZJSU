package OddException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MathDivide mathDivide = new MathDivide();
            System.out.println("请输入被除数和除数并用逗号隔开，输入两组:");
            while (scanner.hasNext()) {
                try {
                    String[] inputs = scanner.nextLine().split(",");
                    double dividend = Double.parseDouble(inputs[0].trim());
                    double divisor = Double.parseDouble(inputs[1].trim());
                    System.out.println(dividend+"/"+divisor+"="+mathDivide.divide(dividend, divisor));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
    }
}
