package u10.Practice;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D(double x, double y) {
        this.x = x;
        this.y = y;
        radius = 1;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public double getRadius () {
        return radius;
    }

    public double getArea () {
        return Math.PI * radius * radius;
    }


}
