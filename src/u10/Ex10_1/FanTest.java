package u10.Ex10_1;
public class FanTest {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		Fan f3 = new Fan();

		f1.setSpeed(Fan.FAST);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);

		f2.setSpeed(Fan.SLOW);
		f2.setRadius(10);
		f2.setColor("red");
		f2.setOn(false);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}
