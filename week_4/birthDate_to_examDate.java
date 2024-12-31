import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class birthDate_to_examDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期（格式：YYY-MM-dd）；");
        String inputDate = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(inputDate);
        LocalDate examDate = birthDate.plusYears(18).withMonth(6).withDayOfMonth(7);
        long days = ChronoUnit.DAYS.between(birthDate, examDate);
        System.out.println("从出生日期到高考的时间间隔是: " + days + " 天");
    }
}

