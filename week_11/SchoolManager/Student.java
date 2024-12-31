package SchoolManager;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int rankInClass;
    int rankInGrade;
    String stuNo;
    String stuName;
    List<Integer> scorelist=new ArrayList<>();
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("学号：").append(stuNo).append("\n");
        sb.append("姓名：").append(stuName).append("\n");
        sb.append("成绩列表：").append(scorelist).append("\n");
        sb.append("班级排名：").append(rankInClass).append("\n");
        sb.append("年级排名：").append(rankInGrade).append("\n");
        return sb.toString();
    }

}
