package StudentMangement;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Banji banji = new Banji();
        Student student = new Student();

        int totalStu = 0;
        for (int i = 0; i < grade.getBjCnt(); i++) {
            System.out.println(grade.getGradeName() + "年级" + (i + 1) + "班");
            int stuCnt = banji.getStuCnt();
            totalStu += stuCnt;
            System.out.println("共有" + stuCnt + "人" + " 班主任：" + banji.getBjTeacher());
            int[][] stuScore = new int[stuCnt][4];
            Random random = new Random();
            for (int j = 0; j < stuCnt; j++) {
                System.out.println("学生姓名：" + student.getStuName() + " 学号：" + student.getStuNo());
                for (int k = 0; k < 4; k++) {
                    stuScore[j][k] = random.nextInt(0, 100) + 1;
                }
                System.out.println("各科成绩如下\n\t操作系统os:" + stuScore[j][0] + " Java:" + stuScore[j][1] + " c语言:" + stuScore[j][2] + " 外语" + stuScore[j][3] + "\n");
            }
        }
        System.out.println("全年级共有" + totalStu + "名学生");
    }
}
