package u11.Ex15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex15_12 extends Application {
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        Circle circle = new Circle(300, 60, 100);
        Text inside = new Text();

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        pane.add(inside, 150, 150);

        circle.setOnMouseEntered(e -> {
            inside.setText("Inside");
        });
        circle.setOnMouseExited(e -> {
            inside.setText("Outside");
        });


        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
