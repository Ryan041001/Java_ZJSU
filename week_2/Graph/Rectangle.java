package Graph;

public class Rectangle extends Shape {
    private final double width;
    private final double height;
    private final String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw() {
        System.out.printf("Drawing a rectangle with width %.1f, height %.1f and color %s", width, height, color);
        System.out.println();
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void print(Rectangle rectangle) {
        System.out.print("Rectangle ");
        super.printArea(rectangle);
        System.out.print("Rectangle ");
        super.printPerimeter(rectangle);
    }
}
