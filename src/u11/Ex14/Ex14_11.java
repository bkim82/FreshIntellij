package u11.Ex14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ex14_11 extends Application {

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Circle circle = new Circle(100, 100, 100, Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        Ellipse eye = new Ellipse(100, 40, 20, 20);
        eye.setFill(Color.WHITE);
        eye.setStroke(Color.BLACK);
        pane.getChildren().add(eye);

        Ellipse eye2 = new Ellipse(100, 40, 50, 20);
        eye2.setFill(Color.WHITE);
        eye2.setStroke(Color.BLACK);
        pane.getChildren().add(eye2);

        Circle pupil = new Circle(75, 40, 10, Color.RED);
        pupil.setStroke(Color.BLACK);
        pane.getChildren().add(pupil);

        Circle pupil2 = new Circle(125, 40, 10, Color.RED);
        pupil2.setStroke(Color.RED);
        pane.getChildren().add(pupil2);

        Arc mouth = new Arc(75, 130, 30, 20, 0, -180);
        pane.getChildren().add(mouth);

        Arc mouth2 = new Arc(125, 130, 30, 20, 0, -180);
        pane.getChildren().add(mouth2);

        Polygon nose = new Polygon(75.0, 110.0, 100.0, 75.0, 125.0, 110.0);
        nose.setFill(Color.BLACK);
        pane.getChildren().add(nose);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}