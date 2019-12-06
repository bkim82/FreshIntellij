package u10.Day12;

public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point (15, 3);
        Point p2 = new Point (1, 4);

        Shape[] shapes = new Shape[3];

//        Rectangle r = new Rectangle (p1, p2);
//        System.out.println(r);
//
//        Circle c = new Circle (p1, 7);
//        System.out.println(c);

        shapes[0] = new Rectangle(p1, p2);
        shapes[1] = new Circle (p1, 7);
        shapes[2] = new Circle (new Point (16,3), 10);

        for (Shape s : shapes) {
            System.out.println(s + "; Area=" + s.getArea());
            s.dilate(1.5);
            System.out.println(s + "; Area=" + s.getArea());

        }
    }
}