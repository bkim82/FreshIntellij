package u10.Ex10_1;

public class QuadraticEquationTest {

	public static void solve (double a, double b, double c)
	{
		QuadraticEquation q = new QuadraticEquation (a,b,c);
		double discriminant = q.getDiscriminant();

		if (discriminant< 0) {
			System.out.println("The equation has no real roots.");
		}
		else if (discriminant == 0) {
			System.out.println("The equation has 1 real root.");
			System.out.println("Value: " + q.getRoot1());
		}
		else {
			System.out.println("The equation has 2 real roots.");
			System.out.println("Root 1: " + q.getRoot1());
			System.out.println("Root 2: " + q.getRoot2());
		}

		if (!((q.getA() == a) && (q.getB() == b) && (q.getC() == c))) {
			System.out.println("Getters failed.");
		}

	}

	public static void main(String[] args) {
		System.out.println("Quadratic Equation tester");

		System.out.println("\nEquation 1:");
		solve (1, 20, 100);

		System.out.println("\nEquation 2:");
		solve (20, 5, 4);

		System.out.println("\nEquation 3:");
		solve (1, 5, 6);
	}

}
