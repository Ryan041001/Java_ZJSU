import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ComputeAndWrite {
    public static void main(String[] args) {
        String filePath = "computing.txt"; // 文件路径

        try {
            // 读取文件内容
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            List<String> results = new ArrayList<>(); // 用于存储结果的列表

            // 遍历每一行，计算和，并构建结果字符串
            for (String line : lines) {
                String[] numbers = line.trim().split(" ");
                StringBuilder sumBuilder = new StringBuilder(numbers[0]); // 初始化StringBuilder以存储第一个数字
                for (int i = 1; i < numbers.length; i++) {
                    sumBuilder.append("+").append(numbers[i]); // 在每个数字之间添加加号
                }
                // 计算和
                int sum = 0;
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
                // 构建结果字符串
                String result = sumBuilder + "=" + sum;
                results.add(result); // 将结果添加到列表中
            }

            // 将结果写入文件
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                for (String result : results) {
                    writer.write(result);
                    writer.newLine(); // 写入新行
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}