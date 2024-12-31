public class Random_number {
    public static void main(String[] args) {
        int cnt = 0;
        while (true) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            int num3 = (int) (Math.random() * 10);
            System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
            if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("win");
                cnt++;
                if (num1 == num2 && num2 == num3 && num1 == 0) {
                    System.out.println("Game over");
                    cnt++;
                    break;
                }
            } else {
                System.out.println("lose");
                cnt++;
            }
        }
        System.out.println("try " + cnt + " times");
    }
}
