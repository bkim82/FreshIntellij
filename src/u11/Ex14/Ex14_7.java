package u11.Ex14;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ex14_7 extends Application {
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);


        for (int row = 0; row<10; row++) {
            for (int column = 0; column < 10; column++) {
                TextField text = new TextField();
                text.setPrefColumnCount(1);
                text.setText(String.valueOf((int)(Math.random()*2)));
                pane.add(text, row, column);
                pane.setHalignment(text, HPos.CENTER);
                pane.setValignment(text, VPos.CENTER);

            }

        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_07"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage


    }
}
