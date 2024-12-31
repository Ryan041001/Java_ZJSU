package StudentMangement;

import java.util.HashSet;
import java.util.Random;

public class Student {
    public String stuName;

    public Student() {

    }

    public void setStuName() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            name.append((char) (random.nextInt(26) + 'a'));
        }
        stuName = name.toString();
    }

    public String getStuName() {
        setStuName();
        return stuName;
    }

    public String getStuNo() {
        Random random = new Random();
        HashSet<String> usedStuNos = new HashSet<>();
        String stuNo;
        do {
            StringBuilder noBuilder = new StringBuilder();
            for (int i = 0; i < 12; i++) {
                noBuilder.append(random.nextInt(10));
            }
            stuNo = noBuilder.toString();
            usedStuNos.add(stuNo);
        } while (!usedStuNos.contains(stuNo));
        return stuNo;
    }
}
