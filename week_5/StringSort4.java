import java.util.*;

public class StringSort4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strings = sc.nextLine();

        List<String> stringList = new ArrayList<>();

        String[] strings1 = strings.split(" ");
        Collections.addAll(stringList, strings1);

        //按字典序排列
        Collections.sort(stringList);
        System.out.println("按字典序排列：");
        System.out.println(stringList);

        // 按字典序降序排序
        stringList.sort(Collections.reverseOrder());
        System.out.println("字典序降序排序：");
        System.out.println(stringList);

        // 按字符串长度降序排序
        stringList.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("按字符串长度降序排序：");
        System.out.println(stringList);

        // 先按字符串长度降序排列再按字典序排序
        stringList.sort(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println("先按字符串长度降序排列再按字典序排序：");
        System.out.println(stringList);
    }
}
