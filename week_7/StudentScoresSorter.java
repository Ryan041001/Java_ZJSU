import java.io.*;
import java.util.*;

public class StudentScoresSorter {

    private static class Student implements Comparable<Student> {
        String id;
        double chinese;
        double math;
        double english;
        double totalScore;

        public Student(String id, double chinese, double math, double english) {
            this.id = id;
            this.chinese = chinese;
            this.math = math;
            this.english = english;
            this.totalScore = chinese + math + english;
        }

        @Override
        public int compareTo(Student other) {
            if (this.totalScore != other.totalScore) {
                return Double.compare(other.totalScore, this.totalScore);
            } else {
                return Double.compare(other.math, this.math);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = "top10input.txt";
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                double chinese = Double.parseDouble(parts[1]);
                double math = Double.parseDouble(parts[2]);
                double english = Double.parseDouble(parts[3]);
                students.add(new Student(id, chinese, math, english));
            }
        }

        Collections.sort(students);

        for (int i = 0; i < Math.min(10, students.size()); i++) {
            Student student = students.get(i);
            System.out.printf("%s\t语文:%.1f, 数学:%.1f, 英语:%.1f, 总分:%.1f%n",
                    student.id, student.chinese, student.math, student.english, student.totalScore);
        }
    }
}