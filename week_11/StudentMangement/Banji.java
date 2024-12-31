package StudentMangement;

import java.util.Random;

public class Banji {

    public Banji() {

    }

    public int getStuCnt() {
        Random random = new Random();
        return random.nextInt(30, 61);
    }

    public String getBjTeacher() {
        Random random = new Random();
        String[] familyName = {"赵", "钱", "孙", "李"};
        String[] firstName = {"花", "超", "峰", "兵"};
        return familyName[random.nextInt(3) + 1] + firstName[random.nextInt(3) + 1];
    }
}
