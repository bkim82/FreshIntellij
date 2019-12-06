package u10.Ex10_1;

public class LinearEquationTest {

	public static void solve (double a, double b, double c, double d, double e, double f)
	{
		LinearEquation l = new LinearEquation (a,b,c,d,e,f);

		if (l.isSolvable()) {
			System.out.println("x=" + l.getX());
			System.out.println("y=" + l.getY());
		}
		else {
			System.out.println("The equation has no solutions.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Linear equation solver!");

		System.out.println("\nEquation 1:");
		solve(2,3,2,-1,4,4);

		System.out.println("\nEquation 2:");
		solve(5,2,15,6,12,36);

		System.out.println("\nEquation 3:");
		solve(2,12,2,12,-3, 5);

		System.out.println("\nEquation 4:");
		solve(2,-1,1,-1,-3,4);
	}
}
