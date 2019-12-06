package u10.practest;

/**
 * Created by bryres on 3/1/2017.
 */
public class TriangleTester {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 4, 6);
        System.out.println("Created 5, 4, 6 triangle");
        System.out.println(t1.toString());

        if (!t1.isIsosceles())
            System.out.println("Passed 1");
        else
            System.out.println("Failed 1");

        if (t1.isScalene())
            System.out.println("Passed 2");
        else
            System.out.println("Failed 2");

        if (t1.getPerimeter() == 15)
            System.out.println("Passed 3");
        else
            System.out.println("Failed 3");

        t1.dilate(2);
        if (t1.getPerimeter() == 30)
            System.out.println("Passed 4");
        else
            System.out.println("Failed 4");

        System.out.println("\n--------------------------------\n");
        Triangle t2 = new Triangle(12);
        System.out.println("Created 12,12,12 triangle");
        System.out.println(t2.toString());

        if (t2.isIsosceles())
            System.out.println("Passed 5");
        else
            System.out.println("Failed 5");

        if (!t2.isScalene())
            System.out.println("Passed 6");
        else
            System.out.println("Failed 6");

        if (t2.getPerimeter() == 36)
            System.out.println("Passed 7");
        else
            System.out.println("Failed 7");

        t2.dilate(.5);
        if (t2.getPerimeter() == 18)
            System.out.println("Passed 8");
        else
            System.out.println("Failed 8");

        if (!t1.isCongruent(t2))
            System.out.println("Passed 9");
        else
            System.out.println("Failed 9");

        Triangle t3 = new Triangle (10, 8, 12);

        if (t1.isCongruent(t3))
            System.out.println("Passed 10");
        else
            System.out.println("Failed 10");
    }
}