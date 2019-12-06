package u11.Ex15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex15_18 extends Application {

    public void start (Stage primaryStage) {

        Pane pane = new Pane();

        // Create a rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(30);
        rectangle.setFill(Color.BLUE);

        pane.getChildren().add(rectangle);

        // Create and register the handle
        pane.setOnMouseDragged(e -> {
            if (rectangle.contains(e.getX(), e.getY())) {
                pane.getChildren().clear();
                rectangle.setX(e.getX() - rectangle.getWidth() * .5);
                rectangle.setY(e.getY() - rectangle.getHeight() * .5);
                pane.getChildren().add(rectangle);
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Exercise_15_18"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
