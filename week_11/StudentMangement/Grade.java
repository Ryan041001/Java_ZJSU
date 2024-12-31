package StudentMangement;

import java.util.Random;

public class Grade {

    public Grade() {

    }

    public String getGradeName() {
        Random random = new Random();
        String[] bj = {"一", "二", "三", "四", "五", "六", "七"};
        return bj[random.nextInt(6) + 1];
    }

    public int getBjCnt() {
        Random random = new Random();
        return random.nextInt(5, 8);
    }
}
