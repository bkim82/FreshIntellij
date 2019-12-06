package u11.Ex15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_3 extends Application {

    private double radius = 30;
    private double x = radius, y = radius;
    private double dx = 20, dy = 20;

    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        Pane pane = new Pane();
        HBox hbox = new HBox(20);

        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);
        hbox.setAlignment(Pos.CENTER);

        Circle circle = new Circle(x, y, radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);


        Button left = new Button("Left");
        Button right = new Button("Right");
        Button up = new Button("Up");
        Button down = new Button("Down");
        hbox.getChildren().addAll(left, right, up, down);

        left.setOnAction(e -> {

            if (x > 0) {
                x -= dx;
                circle.setCenterX(x);
            }
        });

        right.setOnAction(e -> {

            if (x < pane.getWidth()) {
                x += dx;
                circle.setCenterX(x);
            }
        });

        up.setOnAction(e -> {

            if (y >= 0) {
                y -= dy;
                circle.setCenterY(y);
            }
        });

        down.setOnAction(e -> {

            if (y <= pane.getHeight()) {
                y += dy;
                circle.setCenterY(y);
            }
        });

        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        borderPane.requestFocus();
    }
}