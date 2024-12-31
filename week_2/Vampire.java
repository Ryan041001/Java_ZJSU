public class Vampire {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int vn;
        for (vn = 1000; vn < 10000; vn++) {
            if (isVampire(vn)) {
                System.out.println(vn + " = " + a + " * " + b);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间 " + (endTime - startTime)  + " ms");
    }

    public static int a, b;

    public static boolean isVampire(int n) {
        int n1 = n / 1000, n4 = n % 10, n2 = n / 10 % 10, n3 = n / 100 % 10;

        a = n1 * 10 + n2;
        b = n3 * 10 + n4;
        if (a * b == n) {
            return true;
        }

        a = n1 + n2 * 10;
        b = n3 * 10 + n4;
        if (a * b == n) {
            return true;
        }

        a = n1 * 10 + n2;
        b = n3 + n4 * 10;
        if (a * b == n) {
            return true;
        }

        a = n2 * 10 + n1;
        b = n4 * 10 + n3;
        if (a * b == n) {
            return true;
        }

        a = n1 * 10 + n3;
        b = n2 * 10 + n4;
        if (a * b == n) {
            return true;
        }
        a = n1 + n3 * 10;
        b = n2 * 10 + n4;
        if (a * b == n) {
            return true;
        }
        a = n1 * 10 + n3;
        b = n2 + n4 * 10;
        if (a * b == n) {
            return true;
        }

        a = n3 * 10 + n1;
        b = n4 * 10 + n2;
        if (a * b == n) {
            return true;
        }

        a = n1 * 10 + n4;
        b = n2 * 10 + n3;
        if (a * b == n) {
            return true;
        }
        a = n1 + n4 * 10;
        b = n2 * 10 + n3;
        if (a * b == n) {
            return true;
        }
        a = n1 * 10 + n4;
        b = n2 + n3 * 10;
        if (a * b == n) {
            return true;
        }
        a = n1 + n4 * 10;
        b = n2 + n3 * 10;
        if (a * b == n) {
            return true;
        }
        return false;
    }
}

