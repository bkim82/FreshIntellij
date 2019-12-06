package u10.Day12;

public class Point {
    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void translate (double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void dilate (double factor) {
        x *= factor;
        y *= factor;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
