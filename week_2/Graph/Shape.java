package Graph;

public abstract class Shape {

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();

    public void printArea(Shape shape){
        System.out.println("Area:"+shape.getArea());
    }
    public void printPerimeter(Shape shape){
        System.out.println("Perimeter:" + shape.getPerimeter());
    }
}
