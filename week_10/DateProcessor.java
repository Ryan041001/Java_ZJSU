import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[Info] 请输入一段话，并回车！");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("程序结束!");
                break;
            }
            String result = parse(input);
            System.out.println("[result:] " + result);
        }
        scanner.close();
    }

    public static String parse(String str) {
        Pattern pattern = Pattern.compile(".*?(\\d{4})\\s*年|.*?(\\d{2})\\s*月|.*?(\\d{2})\\s*日");
        Matcher matcher = pattern.matcher(str);

        int year = 0, month = 0, day = 0;
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                year = Integer.parseInt(matcher.group(1));
            } else if (matcher.group(2) != null) {
                month = Integer.parseInt(matcher.group(2));
            } else if (matcher.group(3) != null) {
                day = Integer.parseInt(matcher.group(3));
            }
        }

        if (year == 0 || month == 0 || day == 0) {
            return "日期信息不完整";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(sdf.parse(year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day));
        } catch (ParseException e) {
            e.printStackTrace();
            return "日期格式错误";
        }

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        int weekDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        String weekDayStr = weekDays[weekDay];

        return "今天是 " + year + " 年 " + (month < 10 ? "0" : "") + month + " 月的第 " + dayOfMonth + " 天," + weekDayStr;
    }
}