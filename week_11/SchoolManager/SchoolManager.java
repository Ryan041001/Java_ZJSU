package SchoolManager;

import java.util.*;

public class SchoolManager {
    private static final String [] GRADE_NAME={"一年级","二年级","三年级","四年级","五年级","六年级","七年级"};
    private static final String [] LAST_NAME={"赵","钱","孙","李"};
    private static final String [] FIRST_NAME={"花","超","峰","兵"};

    private static String GetStuNo(){
        Random r= new Random();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<12;i++){
            int num=r.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }
    private static String GetStuName(){
        char [] chars="abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random =new Random();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<5;i++){
            sb.append(chars[random.nextInt(26)]);
        }
        return sb.toString();
    }
    public static double AvgScore(Student student){
        int sum=0;
        for(int x:student.scorelist){
            sum+=x;
        }
        return (double) sum/4.0;
    }
    private static void sortStuClass(List<Student> students){
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(AvgScore(o2), AvgScore(o1));
            }
        });
        for(int i=0;i<students.size();i++){
            students.get(i).rankInClass=i+1;
        }
    }
    private static void sortStuGrade(Grade grade){
        List<Student> allStudents=new ArrayList<>();
        for(Banji banji:grade.banjiList){
            allStudents.addAll(banji.studentList);
        }
        allStudents.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                double ret = AvgScore(o2) - AvgScore(o1);
                return (int) ret;
            }
        });
        for(int i=0;i<allStudents.size();i++){
            allStudents.get(i).rankInGrade=i;
        }
    }

    public static void main(String[] args) {
        Random random=new Random();
        Grade grade =new Grade();
        grade.bjCnt=random.nextInt(3)+5;
        grade.GradeName=GRADE_NAME[random.nextInt(7)];
        Map<String,Integer> studentCounter=new HashMap<>();
        for(int i=0;i<grade.bjCnt;i++){
            Banji banji =new Banji();
            banji.stuCnt=random.nextInt(31)+30;
            banji.bjName=grade.GradeName+(i+1)+"班";
            banji.biTeach=LAST_NAME[random.nextInt(4)]+FIRST_NAME[random.nextInt(4)];
            for(int j=0;j<banji.stuCnt;j++){
                String stuNo;
                do {
                    stuNo=GetStuNo();
                }
                while (studentCounter.containsKey(stuNo));
                studentCounter.put(stuNo,1);
                Student student =new Student();
                student.stuNo=stuNo;
                student.stuName=GetStuName();
                for(int k=0;k<4;k++) {
                    student.scorelist.add(random.nextInt(101));
                }
                banji.studentList.add(student);
            }
            grade.totalStuCnt+= banji.stuCnt;
            grade.banjiList.add(banji);
            sortStuClass(banji.studentList);
        }
        sortStuGrade(grade);
        System.out.println(grade);

    }
}
