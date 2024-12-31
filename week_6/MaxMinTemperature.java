import java.io.*;
import java.util.*;

public class MaxMinTemperature {
    public static void main(String[] args) {
        File file = new File("实验六 数据/weather.txt");
        Map<String, Integer> maxTemperatures = new TreeMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                String date = parts[0].split(" ")[0];

                int temperature = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));

                String key = date.split("-")[0] + "-" +date.split("-")[1];
                maxTemperatures.merge(key, temperature, Math::max);
            }

            for (Map.Entry<String, Integer> entry : maxTemperatures.entrySet()) {
                String[] dateParts = entry.getKey().split("-");
                System.out.printf("Year: %s, Month: %s, Max Temperature: %d°C%n",
                        dateParts[0], dateParts[1], entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
