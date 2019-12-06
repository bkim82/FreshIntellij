package u11.Ex14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Ex14_1 extends Application {

    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("image/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("image/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("image/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("image/us.gif")), 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 14_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}