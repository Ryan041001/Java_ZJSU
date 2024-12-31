import java.io.File;

public class FileSearcher {
    public static void main(String[] args) {
        // 指定要搜索的目录
        String directoryPath = "D:\\A_ZJGSU\\CODE\\school";

        // 创建File对象
        File directory = new File(directoryPath);

        // 检查目录是否存在
        if (!directory.exists()) {
            System.out.println("指定的目录不存在");
            return;
        }

        // 调用递归搜索方法
        searchFiles(directory, new boolean[2]); // 初始化布尔数组
    }

    private static void searchFiles(File dir, boolean[] found) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // 递归搜索子目录
                    searchFiles(file, found);
                } else {
                    String fileName = file.getName();
                    if (fileName.endsWith(".java")) {
                        System.out.println("文件" + fileName + " 所在目录为: " + file.getParent());
                        found[0] = true;
                    } else if (fileName.endsWith(".jpg")) {
                        System.out.println("文件" + fileName + " 所在目录为: " + file.getParent());
                        found[1] = true;
                    }
                }
            }
        }
        // 如果当前目录下没有找到.java和.jpg文件，输出目录
        if (!found[0] && !found[1]) {
            System.out.println("目录 " + dir.getPath() + " 下没有找到.java和.jpg文件");
        }
    }
}
