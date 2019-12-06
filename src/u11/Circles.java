package u11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.UP;

public class Circles extends Application {
    private Circle c = new Circle(5);

    public void start (Stage ps) {
        Pane p = new Pane();
        p.getChildren().add(c);
        c.setStroke(Color.BLACK);
        c.setFill(Color.BLACK);
        c.centerXProperty().bind(p.widthProperty().divide(2));
        c.centerYProperty().bind(p.heightProperty().divide(2));

        p.setOnMousePressed(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                c.setRadius(c.getRadius()+1);
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                c.setRadius(c.getRadius()-1);
            }
        });

        p.setOnKeyPressed(e -> {
            if (e.getText().equals("1")) {
                c.setFill(Color.RED);
            }
            else if (e.getText().equals("2")) {
                c.setFill(Color.BLUE);
            }
            else if (e.getCode() == UP) {
                c.setRadius(c.getRadius() +6);
            }
            else if (e.getCode() == DOWN) {
                c.setRadius(c.getRadius() -6);
            }
            else {
                c.setFill(new Color(Math.random(),
                        Math.random(),
                        Math.random(),
                        1
                ));
            }
        });


        Scene scene = new Scene( p,400,400);
        ps.setScene(scene);
        ps.show();
        p.requestFocus();

    }
}
