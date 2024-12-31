package SchoolManager;

import java.util.ArrayList;
import java.util.List;

public class Banji {
    String bjName;
    int stuCnt;
    String biTeach;
    List<Student> studentList =new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("班级：").append(bjName).append("\n");
        sb.append("学生数量：").append(stuCnt).append("\n");
        sb.append("班主任：").append(biTeach).append("\n");
        sb.append("学生列表：\n");
        for(Student student:studentList){
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
