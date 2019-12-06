import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test_House extends Application {

    public void start(Stage ps) {

        Pane pane = new Pane();

        Rectangle box = new Rectangle(150, 150);
        box.setFill(Color.RED);
        box.setX(175);
        box.setY(150);

        Rectangle box2 = new Rectangle(50,60);
        box2.setFill(Color.BLUE);
        box2.setStroke(Color.WHITE);
        box2.setX(250);
        box2.setY(225);


        Polygon roof = new Polygon(200.0, 150.0, 225.0, 115.0, 250.0, 150.0);
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);

        box2.setOnMouseEntered(e -> {

//            box2.setStrokeWidth(3);
        if (e.getButton() == MouseButton.PRIMARY) {
            box2.setStrokeWidth(500);
        }
        if (e.getButton() == MouseButton.SECONDARY) {
            box2.setStrokeWidth(5);
        }

        });






        pane.getChildren().addAll(box, box2, roof);


        Scene scene = new Scene(pane,500,500);
        ps.setScene(scene);
        ps.show();

    }



}
