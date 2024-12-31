import java.io.*;
import java.util.*;

public class TemperatureSorter {
    public static void main(String[] args) {
        File file = new File("实验六 数据/weather.txt");
        try (Scanner scanner = new Scanner(file)) {
            List<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            lines.sort((o1, o2) -> {
                String[] parts1 = o1.split(" ");
                String[] parts2 = o2.split(" ");
                int dateComparison = parts1[0].compareTo(parts2[0]);
                if (dateComparison != 0) {
                    return dateComparison;
                }
                int timeComparison = parts1[1].compareTo(parts2[1]);
                if (timeComparison != 0) {
                    return timeComparison;
                }
                return Integer.parseInt(parts2[2].substring(0, parts2[2].length() - 1))
                        - Integer.parseInt(parts1[2].substring(0, parts1[2].length() - 1));
            });
            System.out.println("日期按年月日升序、温度按降序:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}