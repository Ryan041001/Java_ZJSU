package SchoolManager;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    String GradeName;
    int bjCnt;
    int totalStuCnt;
    List<Banji> banjiList =new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("年级：").append(GradeName).append("\n");
        sb.append("班级数量：").append(bjCnt).append("\n");
        sb.append("学生总数：").append(totalStuCnt).append("\n");
        sb.append("班级列表：").append("\n");
        for (Banji banji:banjiList){
            sb.append(banji).append("\n");
        }
        return sb.toString();
    }

    StringBuilder sb=new StringBuilder();
}
