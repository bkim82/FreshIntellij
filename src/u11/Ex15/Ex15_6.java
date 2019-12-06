package u11.Ex15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ex15_6 extends Application {

    public void start (Stage ps) {

        GridPane pane = new GridPane();

        Text text1 = new Text("Java is fun");
        text1.xProperty().bind(pane.widthProperty().divide(2));
        text1.yProperty().bind(pane.heightProperty().divide(2));

        Text text2 = new Text("Java is powerful");
        text2.xProperty().bind(pane.widthProperty().divide(2));
        text2.yProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(text1);

        pane.setOnMouseClicked( e -> {
            if (pane.getChildren().contains(text1)) {
                pane.getChildren().add(text2);
                pane.getChildren().remove(text1);
            }
            else {
                pane.getChildren().add(text1);
                pane.getChildren().remove(text2);

            }
        });

        Scene scene = new Scene(pane, 150, 50);
        ps.setTitle("Exercise_15_06"); // Set the stage title
        ps.setScene(scene); // Place the scene in the stage
        ps.show(); // Display the stage

    }

}


pane.setOnKeyPressed(e -> {
        if (e.getText().equals(“x”) {
        code stuff;
        }
        });