package u11.Ex14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_2 extends Application {

    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5,5,5,5));
        pane.setHgap(5);
        pane.setVgap(5);

        String[] images = {"image/x.gif", "image/o.gif"};

        for (int i = 0; i <9; i++) {
            int r = (int)(Math.random()*3);

            if (r<2) {
                Image image = new Image(images[r]);
                ImageView imageView = new ImageView(image);
                imageView.setFitHeight(100);
                imageView.setFitWidth(100);

                pane.add(imageView, i%3, i/3);
            }
        }



        Scene scene = new Scene(pane);
        primaryStage.setTitle ("Exercise 14_02");
        primaryStage.setScene (scene);
        primaryStage.show();
    }

}
