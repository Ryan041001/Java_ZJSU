import java.util.Scanner;

public class What_Day_is_It_Today {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("年：");
        int year = scan.nextInt();
        System.out.print("月：");
        int month = scan.nextInt();
        System.out.print("日：");
        int day = scan.nextInt();
        int day1 = day;
        switch (month) {
            case 12:
                day += 30;
            case 11:
                day += 31;
            case 10:
                day += 30;
            case 9:
                day += 31;
            case 8:
                day += 31;
            case 7:
                day += 30;
            case 6:
                day += 31;
            case 5:
                day += 30;
            case 4:
                day += 31;
            case 3:
                day += 28;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day++;
                }
            case 2:
                day += 31;
                break;
        }
        System.out.println(year + "年" + month + "月" + day1 + "日是这一年的第" + day + "天");
    }
}


