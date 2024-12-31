import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CreateCopyPathThreads {
    static int count = 0;
    static List<Thread> list = new ArrayList<>();//存储线程对象.

    static void createCopyPathThreads(String srcPath, String desPath) {
        File srcPathFile = new File(srcPath);
        File desPathFile = new File(desPath);
        if (srcPathFile.isDirectory()) {

            if (!(new File(desPath)).exists()) {
                desPathFile.mkdir();//创建目录
            }
            String[] filesPathString = srcPathFile.list();
            if (filesPathString != null) {
                for (String subItem : filesPathString) {
                    String absoluteSrcSubItemStr = srcPath + File.separator + subItem;
                    String absoluteDesSubItemStr = desPath + File.separator + subItem;
                    createCopyPathThreads(absoluteSrcSubItemStr, absoluteDesSubItemStr);
                }//endFor
            }
        }//end if
        else {
            Thread thread = new Thread(() -> {
                if (!desPathFile.exists()) {
                    try {
                        //复制file
                        Files.copy(srcPathFile.toPath(), desPathFile.toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.setName("threadNo" + count++);
            list.add(thread);
        }
    }//endCopyFunction

    public static int getCount() {
        return count = list.size();
    }

    public static void copyPath(String srcPath, String desPath) throws InterruptedException {
        createCopyPathThreads(srcPath, desPath);
        for (Thread thread : list) {
            thread.start();
        }
        for (Thread thread : list) {
            thread.join();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        copyPath("D:\\A_ZJGSU\\CODE\\school\\Java\\week11", "D:\\A_ZJGSU\\CODE\\school\\Java\\week_11\\copied");
        System.out.println("共启用了" + CreateCopyPathThreads.getCount() + "个线程");
        System.out.println("目录拷贝完成,共耗时" + (System.currentTimeMillis() - startTime) + "毫秒");
    }
}
