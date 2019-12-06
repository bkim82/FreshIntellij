package u11.Ex14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Ex14_14 extends Application {

    public void start(Stage primaryStage) {
        Pane pane = new Pane();


        final double length = 100.0;
        Rectangle r1 = new Rectangle(length/2, 0, length, length);
        r1.widthProperty().bind(pane.widthProperty().subtract(length/2));
        r1.heightProperty().bind(pane.heightProperty().subtract(length));
        r1.setFill(Color.TRANSPARENT);
        r1.setStroke(Color.BLACK);

        Rectangle r2 = new Rectangle(0, length / 2, length, length);
        r2.widthProperty().bind(pane.widthProperty().subtract(length / 2));
        r2.heightProperty().bind(pane.heightProperty().subtract(length / 1));
        r2.setFill(Color.TRANSPARENT);
        r2.setStroke(Color.BLACK);
        r2.setStrokeWidth(2);
        r1.getStrokeDashArray().addAll(3.0, 10.5);

        Line l1 = new Line(r2.getX(), r2.getY(), r1.getX(), r1.getY());
        l1.setStrokeWidth(2);

        Line l2 = new Line();
        l2.setStartX(r2.getX());
        l2.setEndX(r1.getX());
        l2.startYProperty().bind(r2.yProperty().add(r2.heightProperty()));
        l2.endYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l2.getStrokeDashArray().addAll(3.0, 10.5);

        Line l3 = new Line();
        l3.setStartY(r2.getY());
        l3.setEndY(r1.getY());
        l3.startXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        l3.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l3.setStrokeWidth(2);

        Line l4 = new Line();
        l4.startXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        l4.startYProperty().bind(r2.yProperty().add(r2.heightProperty()));
        l4.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l4.endYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l4.setStrokeWidth(2);
        pane.getChildren().addAll(r1, r2, l1, l2, l3, l4);

        Line cl1 = new Line();
        cl1.startXProperty().bind(r1.xProperty());
        cl1.startYProperty().bind(r1.yProperty());
        cl1.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        cl1.endYProperty().bind(r1.yProperty());
        cl1.setStrokeWidth(2);
        pane.getChildren().add(cl1);

        Line cl2 = new Line();
        cl2.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        cl2.startYProperty().bind(r1.yProperty());
        cl2.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        cl2.endYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        cl2.setStrokeWidth(2);
        pane.getChildren().add(cl2);

        StackPane sPane = new StackPane();
        sPane.setAlignment(Pos.CENTER);
        sPane.setPadding(new Insets(10));
        sPane.getChildren().add(pane);

        Scene scene = new Scene(sPane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}