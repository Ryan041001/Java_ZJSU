package SameIntegerException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class SameIntegerExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        int count = 0;


        while (count < 10) {
            try {
                int number = scanner.nextInt();
                if (numbers.contains(number)) {
                    throw new SameIntegerException("输入的数" + number + "与已输入的数" + numbers + "有相同");
                }
                numbers.add(number);
                count++;
            } catch (SameIntegerException e) {
                e.printStackTrace();
                System.out.println("请重新输入:");
            }
        }

        System.out.println("输入的10个不同整数为:");
        System.out.println(numbers);
    }
}