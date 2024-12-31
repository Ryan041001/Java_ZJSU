package Point;

public class Point {
    double x;
    double y;
    double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }


}

