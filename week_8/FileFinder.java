import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 要搜索的文件名
        System.out.println("请输入要查找的文件名：");
        String fileName = scanner.nextLine();
        // 要搜索的根目录
        String rootPath = "D:\\A_ZJGSU\\CODE\\school\\Java";

        // 创建File对象
        File root = new File(rootPath);
        // 调用搜索方法
        String result = searchFile(root, fileName);
        // 输出结果
        System.out.println(Objects.requireNonNullElse(result, rootPath + "目录下没有此文件"));
    }

    private static String searchFile(File dir, String fileName) {
        // 遍历目录
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件且名称匹配
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file.getAbsolutePath(); // 返回文件的绝对路径
                }
                // 如果是目录，递归搜索
                if (file.isDirectory()) {
                    String result = searchFile(file, fileName);
                    if (result != null) {
                        return result; // 如果在子目录中找到，返回路径
                    }
                }
            }
        }
        return null; // 如果没有找到，返回null
    }
}
