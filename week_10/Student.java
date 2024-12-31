import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student implements Comparable<Student> {
    String id;
    String name;
    int age;
    char gender;
    Map<String, Integer> scores;

    public Student(String id, String name, int age, char gender, Map<String, Integer> scores) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.scores = scores;
    }

    @Override
    public int compareTo(Student other) {
        try {
            if (this.totalScore()!= other.totalScore()) {
                return other.totalScore() - this.totalScore();
            } else if (this.scienceScore()!= other.scienceScore()) {
                return other.scienceScore() - this.scienceScore();
            } else if (this.artScore()!= other.artScore()) {
                return other.artScore() - this.artScore();
            } else if (this.gender!= other.gender) {
                return this.gender == '女'? -1 : 1;
            } else {
                throw new ScoresCannotSortedException(this, other);
            }
        } catch (ScoresCannotSortedException e) {
            // 处理 ScoresCannotSortedException，例如记录日志或返回一个默认值
            System.err.println(e.getMessage());
            return 0; // 返回0表示两个学生相等
        }
    }

    protected int totalScore() {
        return scores.values().stream().mapToInt(Integer::intValue).sum();
    }

    protected int scienceScore() {
        return scores.entrySet().stream()
                .filter(entry ->!entry.getKey().startsWith("语文") &&!entry.getKey().startsWith("历史") &&!entry.getKey().startsWith("地理"))
                .mapToInt(Map.Entry::getValue).sum();
    }

    protected int artScore() {
        return scores.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith("语文") || entry.getKey().startsWith("历史") || entry.getKey().startsWith("地理"))
                .mapToInt(Map.Entry::getValue).sum();
    }
}

class ScoresCannotSortedException extends Exception {
    public ScoresCannotSortedException(Student student1, Student student2) {
        super(student1.name + "与" + student2.name + "成绩相同，无法准确排名，已遵循lady first原则");
    }
}

class ScoreSorter {
    public static void main(String[] args) {
        List<Student> students;
        try {
            students = readStudentsFromFile();
            students.sort(Student::compareTo);

            // 输出表头
            System.out.println("排名 姓名 性别 年龄 总分 理科总分 文科总分");

            // 排名从1开始
            int rank = 1;
            for (Student student : students) {
                int totalScore = student.totalScore();
                int scienceScore = student.scienceScore();
                int artScore = student.artScore();

                System.out.printf("%-5d %-5s %-2s %-3d", rank, student.name, student.gender, student.age);

                System.out.printf(" %-5d %-5d %-5d%n", totalScore, scienceScore, artScore);
                rank++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> readStudentsFromFile() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("scores.txt"))) {
            String line;
            br.readLine(); // Skip the first line with comments
            br.readLine(); // Skip the second line with comments

            while ((line = br.readLine())!= null) {
                String[] parts = line.split(",");
                String id = parts[0].trim();
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                char gender = parts[3].trim().charAt(0);
                Map<String, Integer> scores = new HashMap<>();

                for (int i = 4; i < parts.length; i++) {
                    String[] scoreParts = parts[i].split("=");
                    scores.put(scoreParts[0].trim(), Integer.parseInt(scoreParts[1].trim()));
                }

                students.add(new Student(id, name, age, gender, scores));
            }
        }
        return students;
    }
}