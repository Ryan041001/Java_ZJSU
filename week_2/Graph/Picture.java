package Graph;

public class Picture {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "红色");
        circle.draw();
        circle.print(circle);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "蓝色");
        rectangle.draw();
        rectangle.print(rectangle);
        Triangle triangle = new Triangle(3.0, 4.0, "绿色");
        triangle.draw();
        triangle.print(triangle);
    }
}
