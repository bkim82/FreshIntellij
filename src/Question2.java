import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Question2 extends Application {

    public void start(Stage ps) {
        Pane pane = new Pane();

        double width = 20;
        double height = 20;

        BorderPane borderPane = new BorderPane();

        Label number1 = new Label("Add: ");
        TextField one1 = new TextField();


        Button add = new Button("Add");


        Circle circle = new Circle();
        circle.setRadius(one1);

        add.setOnAction(e -> {

            setRandomProperties(circle, width, height);

            pane.getChildren().add(circle);

    });
        circle.setOnMouseClicked(e -> {
            pane.getChildren().clear();
            setRandomProperties(circle, width, height);
            pane.getChildren().add(circle);
        });


        borderPane.setBottom(number1);
        borderPane.setBottom(one1);


        borderPane.getChildren().addAll(pane);

        Scene scene = new Scene(borderPane, 900, 100);
        ps.setScene(scene);
        ps.show();
        borderPane.requestFocus();


    }
    private void setRandomProperties(Circle c, double width, double height) {
        c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        c.setCenterX(c.getRadius() + Math.random() *
                (width - c.getRadius() * 2));
        c.setCenterY(c.getRadius() + Math.random() *
                (height - c.getRadius() * 2));
    }
}





}
