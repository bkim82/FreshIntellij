package u11.Ex15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ex15_16 extends Application {

    public void start(Stage ps) {

        Pane pane = new Pane();

        Circle circle1 = new Circle(20, 20, 20);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(80, 110, 20);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        line.startXProperty().bind(circle1.centerXProperty());
        line.startYProperty().bind(circle1.centerYProperty());
        line.endXProperty().bind(circle2.centerXProperty());
        line.endYProperty().bind(circle2.centerYProperty());
        pane.getChildren().addAll(circle1, circle2, line);

        double midPointX = (line.getStartX()+line.getEndX()) / 2;
        double midPointY = (line.getStartY()+line.getEndY()) / 2;

        String distanceVal = String.format("%.1f", Math.sqrt(Math.pow(line.getStartX()-line.getEndX(), 2) + Math.pow(line.getStartY()-line.getEndY(), 2)));
        Text distance = new Text(midPointX, midPointY, distanceVal);

        pane.getChildren().add(distance);

        circle1.setOnMouseDragged(e -> {

            double midPointx = (line.getStartX()+line.getEndX()) / 2;
            double midPointy = (line.getStartY()+line.getEndY()) / 2;

            circle1.setCenterX(e.getX());
            circle1.setCenterY(e.getY());
            distance.setX(midPointx);
            distance.setY(midPointy);

            String distanceValp = String.format("%.1f", Math.sqrt(Math.pow(line.getStartX()-line.getEndX(), 2) + Math.pow(line.getStartY()-line.getEndY(), 2)));
            distance.setText(distanceValp);
        });

        circle2.setOnMouseDragged(e -> {

            double midPointx = (line.getStartX()+line.getEndX()) / 2;
            double midPointy = (line.getStartY()+line.getEndY()) / 2;

            circle2.setCenterX(e.getX());
            circle2.setCenterY(e.getY());
            distance.setX(midPointx);
            distance.setY(midPointy);

            String distanceValx = String.format("%.0f", Math.sqrt(Math.pow(line.getStartX()-line.getEndX(), 2) + Math.pow(line.getStartY()-line.getEndY(), 2)));
            distance.setText(distanceValx);
        });

        Scene scene = new Scene(pane, 300, 200);
        ps.setScene(scene);
        ps.show();
    }
}