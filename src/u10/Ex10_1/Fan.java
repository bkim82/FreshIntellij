package u10.Ex10_1;

public class Fan {
    public static final int SLOW = 1;
    public static final int MED = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public Fan() {

    }

    public String toString() {
        if (isOn()) {
            if (speed == SLOW) {
                return String.format("Speed: %s Color: %s Radius: %.1f","Slow" , color , radius);
            }
            if (speed == MED) {
                return String.format("Speed: %s Color: %s Radius: %.1f","Medium" , color , radius);
            }
            if (speed == FAST) {
                return String.format("Speed: %s Color: %s Radius: %.1f", "Fast", color, radius);
            }
        }
        return String.format("Fan is Off. Color: %s Radius: %.1f", color , radius);
    }
}

