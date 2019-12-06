package u11.Ex14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ex14_9 extends Application {
    public void start (Stage ps) {

        GridPane pane = new GridPane();
        pane.add(new FanPane(), 0, 0);
        pane.add(new FanPane(), 0, 1);
        pane.add(new FanPane(), 1,0);
        pane.add(new FanPane(), 1, 1);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        pane.getColumnConstraints().add(column1);
        pane.getColumnConstraints().add(column1);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(50);
        pane.getRowConstraints().add(row1);
        pane.getRowConstraints().add(row1);

        Scene scene = new Scene(pane, 400, 400);
        ps.setScene(scene);
        ps.show();
    }

}
class FanPane extends Pane {

    public FanPane() {

        Ellipse e = new Ellipse();

        e.radiusXProperty().bind(widthProperty().divide(2).subtract(10));
        e.radiusYProperty().bind(heightProperty().divide(2).subtract(10));
        e.centerXProperty().bind(widthProperty().divide(2));
        e.centerYProperty().bind(heightProperty().divide(2));
        e.setStrokeWidth(3);
        e.setFill(Color.WHITE);
        e.setStroke(Color.RED);
        getChildren().add(e);

        Arc a = new Arc();
        a.setStartAngle(30);
        a.setLength(45);

        a.radiusXProperty().bind(widthProperty().divide(2).subtract(15));
        a.radiusYProperty().bind(heightProperty().divide(2).subtract(15));
        a.centerXProperty().bind(widthProperty().divide(2));
        a.centerYProperty().bind(heightProperty().divide(2));
        a.setStrokeWidth(3);
        a.setFill(Color.RED);
        a.setStroke(Color.RED);
        a.setType(ArcType.ROUND);
        getChildren().add(a);

    }
}
