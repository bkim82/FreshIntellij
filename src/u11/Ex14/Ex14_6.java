package u11.Ex14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_6 extends Application {

    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        for (int row = 0; row<8; row++) {
            for (int column = 0; column < 8; column++) {
                Rectangle rect = new Rectangle();
                rect.widthProperty().bind(pane.widthProperty().divide(8));
                rect.heightProperty().bind(pane.heightProperty().divide(8));
                rect.xProperty().bind(pane.widthProperty().divide(8).multiply(column));
                rect.yProperty().bind(pane.heightProperty().divide(8).multiply(row));

                rect.setFill (Color.YELLOW);
                if((row + column) % 2 == 0) {
                    rect.setFill(Color.BLACK);
                }

                pane.getChildren().add(rect);
            }
        }





        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
