package u11.Ex14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_10 extends Application {

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Ellipse up = new Ellipse(100, 100, 50, 25);
        up.setFill(Color.WHITE);
        up.setStroke(Color.BLACK);
        up.radiusXProperty().bind(pane.widthProperty().divide(4).subtract(10));
        up.centerXProperty().bind(pane.widthProperty().divide(2));
        up.centerYProperty().bind(pane.heightProperty().divide(4));
        pane.getChildren().add(up);

        Arc low = new Arc();
        low.centerXProperty().bind((up.centerXProperty()));
        low.centerYProperty().bind(up.centerYProperty().multiply(3));
        low.radiusXProperty().bind(up.radiusXProperty());
        low.radiusYProperty().bind(up.radiusYProperty());
        low.setStartAngle(0);
        low.setLength(-180);
        low.setType(ArcType.OPEN);
        low.setFill(Color.WHITE);
        low.setStroke(Color.BLACK);
        pane.getChildren().add(low);

        Line left = new Line();
        left.startXProperty().bind(up.centerXProperty().subtract(up.radiusXProperty()));
        left.startYProperty().bind(up.centerYProperty());
        left.endXProperty().bind(low.centerXProperty().subtract(low.radiusXProperty()));
        left.endYProperty().bind(low.centerYProperty());

        Line right = new Line();
        right.startXProperty().bind(up.centerXProperty().add(up.radiusXProperty()));
        right.startYProperty().bind(up.centerYProperty());
        right.endXProperty().bind(low.centerXProperty().add(low.radiusXProperty()));
        right.endYProperty().bind(low.centerYProperty());

        pane.getChildren().addAll(left, right);

        Arc upperArc = new Arc();
        upperArc.centerXProperty().bind((up.centerXProperty()));
        upperArc.centerYProperty().bind(up.centerYProperty().multiply(3));
        upperArc.radiusXProperty().bind(up.radiusXProperty());
        upperArc.radiusYProperty().bind(up.radiusYProperty());
        upperArc.setStartAngle(0);
        upperArc.setLength(180);
        upperArc.setType(ArcType.OPEN);
        upperArc.setFill(Color.WHITE);
        upperArc.setStroke(Color.BLACK);
        upperArc.getStrokeDashArray().addAll(3.0, 10.5);
        pane.getChildren().add(upperArc);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}