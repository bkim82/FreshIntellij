package u11.Ex15;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex15_16again extends Application {

    public void start(Stage primaryStart) {

        Pane pane = new Pane();

        Circle c1 = new Circle(10);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        c1.centerXProperty().setValue(40);
        c1.centerYProperty().setValue(40);

        Circle c2 = new Circle(10);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        c2.centerXProperty().setValue(120);
        c2.centerYProperty().setValue(150);

        Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
        line.startXProperty().bind(c1.centerXProperty());
        line.startYProperty().bind(c1.centerYProperty());
        line.endXProperty().bind(c2.centerXProperty());
        line.endYProperty().bind(c2.centerYProperty());

        circle
    }
}
