package OddException;

public class MathDivide {
    public double divide(double b, double c) throws OddException {
        String operation = String.format("%.2f/%.2f", b, c);
        if (c % 2 != 0) {
            throw new OddException(operation + "除数不能为奇数");
        }
        return b / c;
    }
}
