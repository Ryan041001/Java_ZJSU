public class Hanoi_Tower {
    public static void main(String[] args) {
        Hanoi(4, 'A', 'C', 'B');
    }

    static int cnt = 0;

    public static void Hanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            cnt++;
            System.out.println("Move " + cnt + " disk 1 from " + from + " to " + to);
            return;
        }
        Hanoi(n - 1, from, aux, to);
        cnt++;
        System.out.println("Move " + cnt + " disk " + n + " from " + from + " to " + to);
        Hanoi(n - 1, aux, to, from);

    }
}
