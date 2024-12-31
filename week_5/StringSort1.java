import java.util.*;

public class StringSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<String> strings = new ArrayList<>(Arrays.asList(input.split(" ")));

        Collections.sort(strings);

        System.out.println(strings);
    }
}

