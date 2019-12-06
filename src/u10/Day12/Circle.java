package u10.Day12;

public class Circle extends Shape {
    private Point p;
    private double radius;

    public Circle (Point p, double radius) {
        super("Circle");
        this.p = p;
        this.radius = radius;
    }

    public void translate (double dx, double dy) {
        p.translate(dx, dy);
    }

    public void dilate (double factor) {
        p.dilate(factor);
        radius *= factor;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return super.toString() + p + "; Radius = " + radius;
    }

}
