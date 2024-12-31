package Graph;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final String color;

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public void draw() {
        System.out.printf("Drawing a triangle with base %.1f,height %.1f, and color %s", base, height, color);
        System.out.println();
    }

    public double getArea() {
        return base * height / 2;
    }

    public double getPerimeter() {
        return Math.sqrt(base * base + height * height) + base + height;
    }

    public void print(Triangle triangle) {
        System.out.print("Triangle ");
        super.printArea(triangle);
        System.out.print("Triangle ");
        super.printPerimeter(triangle);
    }
}
