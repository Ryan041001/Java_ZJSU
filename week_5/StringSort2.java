import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (true) {
            String string = sc.next();
            if ("-1".equals(string))
                break;
            strings.add(string);
        }
        Collections.sort(strings);
        System.out.println(strings);
    }
}
