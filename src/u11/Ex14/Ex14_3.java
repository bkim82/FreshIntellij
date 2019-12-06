package u11.Ex14;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class Ex14_3 extends Application {

    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        String a = "";
        String b = "";
        String c = "";

        Random rand = new Random();
        int int1 = rand.nextInt(55);
        int int2 = rand.nextInt(55);
        int int3 = rand.nextInt(55);

        a += ("image/card/" + int1 + ".png");
        b += ("image/card/" + int2 + ".png");
        c += ("image/card/" + int3 + ".png");

        Image image1 = new Image(a);
        Image image2 = new Image(b);
        Image image3 = new Image(c);

        pane.add(new ImageView(image1), 0, 0);
        pane.add(new ImageView(image2), 1, 0);
        pane.add(new ImageView(image3), 2, 0);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
