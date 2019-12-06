package practest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoardTest extends Application {
    @Override
    public void start(Stage ps) {
        GridPane gp = new GridPane();
        int c = 0;

        for (int row=0; row<8; row++) {
            for (int column = 0; column < 8; column++) {
                CheckerSquare cs = new CheckerSquare((row + column) % 2);
                cs.prefWidthProperty().bind(gp.widthProperty().divide(8));
                cs.prefHeightProperty().bind(gp.heightProperty().divide(8));
                gp.add(cs, column, row);
            }
        }

        Scene scene = new Scene(gp);
        ps.setTitle("Checkers");
        ps.setScene(scene);
        ps.show();
    }
}

class CheckerSquare extends Pane {
    public static final int RED = 0;
    public static final int GREEN = 1;

    public static final Color[] HIGHLIGHTED = {
            new Color(244.0/255, 66.0/255, 66.0/255, 1),
            new Color(66.0/255, 244.0/255, 66.0/255, 1)
    };

    public static final Color[] STANDARD = {
            new Color(211.0/255, 31.0/255, 31.0/255, 1),
            new Color(31.0/255, 211.0/255, 31.0/255, 1)
    };

    public int color;
    public Ellipse ellipse;

    CheckerSquare(int color) {
        this.color = color;
        Rectangle r = new Rectangle(0,0,0,0);
        r.widthProperty().bind(this.widthProperty());
        r.heightProperty().bind(this.heightProperty());
        r.setFill(STANDARD[color]);
        r.setStroke(STANDARD[color]);

        r.setOnMouseEntered(e->{
            r.setFill(HIGHLIGHTED[color]);
            r.setStroke(HIGHLIGHTED[color]);
        });

        r.setOnMouseExited(e->{
            r.setFill(STANDARD[color]);
            r.setStroke(STANDARD[color]);
        });
        getChildren().add(r);

        setOnMouseClicked(e-> {
            if (ellipse == null) {
                ellipse = new Ellipse();
                ellipse.setFill (Color.BLACK);
                ellipse.setStroke(Color.BLACK);
                ellipse.centerXProperty().bind(widthProperty().divide(2));
                ellipse.centerYProperty().bind(heightProperty().divide(2));
                ellipse.radiusXProperty().bind(widthProperty().multiply(.4));
                ellipse.radiusYProperty().bind(heightProperty().multiply(.4));
                this.getChildren().add(ellipse);
            }
            else {
                this.getChildren().remove(ellipse);
                ellipse = null;
            }
        });
    }

}
