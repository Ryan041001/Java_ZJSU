import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) throws IOException {
        String[] fileNames = {
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 1.txt",
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 2.txt",
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 3.txt",
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 4.txt",
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 5.txt",
                "D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\Lincoln, Abraham - The Writings of Abraham Lincoln Volume 6.txt",
        };

        // 读取停用词
        Set<String> stopwords = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\A_ZJGSU\\CODE\\school\\Java\\week_6\\实验六 数据\\stopwords.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                stopwords.add(line.trim().toLowerCase());
            }
        }

        // 用于存储单词频率的HashMap
        Map<String, Integer> wordCounts = new HashMap<>();

        // 读取每个文件并统计词频
        for (String fileName : fileNames) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // 去除标点符号
                    line = line.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
                    // 分割单词
                    String[] words = line.split(" ");
                    for (String word : words) {
                        if (!stopwords.contains(word) && !word.isEmpty()) {
                            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }
        }

        // 将HashMap转换为List，并按词频降序排列
        List<Map.Entry<String, Integer>> sortedWordCounts = new ArrayList<>(wordCounts.entrySet());
        sortedWordCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // 将结果写入到WordCount.txt文件中
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("WordCount.txt"))) {
            for (Map.Entry<String, Integer> entry : sortedWordCounts) {
                bw.write(entry.getKey() + " " + entry.getValue());
                bw.newLine();
            }
        }

        System.out.println("Word frequency count completed and saved to WordCount.txt");
    }
}