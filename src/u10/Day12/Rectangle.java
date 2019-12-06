package u10.Day12;

public class Rectangle extends Shape {
    private Point p1, p2;

    public Rectangle (Point pt1, Point pt2) {
        super("Rectangle");
        p1 = new Point(pt1);
        p2 = new Point(pt2);
    }

    public double getWidth() {
        return Math.abs (p1.x - p2.x);
    }

    public double getHeight() {
        return Math.abs (p1.y - p2.y);
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2* (getHeight() + getWidth());
    }

    public void translate (double dx, double dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
    }

    public void dilate (double factor) {
        p1.dilate(factor);
        p2.dilate(factor);
    }

    public String toString() {
        return super.toString() + p1 + "; " + p2;
    }

    public Point getPoint1() {
        return new Point(p1);
    }

    public Point getPoint2() {
        return new Point(p2);
    }

    public void setPoint1 (Point p) {
        p1 = new Point(p);
    }

}
