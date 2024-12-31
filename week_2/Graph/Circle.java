package Graph;

public class Circle extends Shape {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.printf("Drawing circle with radius %.1f and color %s", radius, color);
        System.out.println();

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print(Circle circle) {
        System.out.print("Circle ");
        super.printArea(circle);
        System.out.print("Circle ");
        super.printPerimeter(circle);
    }
}