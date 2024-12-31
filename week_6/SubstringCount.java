import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int length = input.length();

        // 遍历所有可能的子串长度
        for (int i = 1; i <= length; i++) {
            Map<String, Integer> map = new HashMap<>();
            int start = 0;
            int end = i;

            // 遍历字符串，统计每个长度为i的子串出现次数
            while (end <= length) {
                String sub = input.substring(start, end);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                start++;
                end++;
            }

            // 打印当前子串长度i的统计结果
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
