package u10.bouncer;

import javax.swing.*;
import java.awt.*;

public class RectangleSprite extends Sprite {
    protected Color color;
    protected int width;
    protected int height;

    public RectangleSprite(JPanel panel, int dx, int dy, int radius, Color color) {
        super(panel, dx, dy);
        this.width = width;
        this.height = height;
        this.color = color;

    }

}
