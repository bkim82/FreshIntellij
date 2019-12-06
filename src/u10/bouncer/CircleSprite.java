package u10.bouncer;

import u10.Day12.Circle;

import javax.swing.*;
import java.awt.*;

public class CircleSprite extends Sprite {
    protected int radius;
    protected Color color;

    public CircleSprite(JPanel panel, int dx, int dy, int radius, Color color) {
        super(panel, dx, dy);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
    }

    @Override
    public int getRight() {
        return x + radius;
    }

    @Override
    public int getLeft() {
        return x - radius;
    }

    @Override
    public int getTop() {
        return y-radius;
    }

    @Override
    public int getBottom() {
        return y+radius;
    }
}