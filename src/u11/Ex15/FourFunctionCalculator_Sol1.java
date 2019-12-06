package u11.Ex15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class FourFunctionCalculator_Sol1 extends Application {
    private BorderPane bp = new BorderPane();
    private GridPane gp = new GridPane();
    private TextField txtDisplay = new TextField();

    @Override
    public void start(Stage primaryStage) {
        bp.setTop(txtDisplay);
        txtDisplay.prefWidthProperty().bind(bp.widthProperty());
        gp.prefWidthProperty().bind(bp.widthProperty());
        gp.prefHeightProperty().bind(bp.heightProperty());
        bp.setCenter(gp);
        gp.add(new NumberButton("7"), 0,0);
        gp.add(new NumberButton("8"), 1,0);
        gp.add(new NumberButton("9"), 2,0);
        gp.add(new NumberButton("/"), 3,0);

        gp.add(new NumberButton("4"), 0,1);
        gp.add(new NumberButton("5"), 1,1);
        gp.add(new NumberButton("6"), 2,1);
        gp.add(new NumberButton("*"), 3,1);

        gp.add(new NumberButton("1"), 0,2);
        gp.add(new NumberButton("2"), 1,2);
        gp.add(new NumberButton("3"), 2,2);
        gp.add(new NumberButton("-"), 3,2);

        gp.add(new NumberButton("0"), 0,3);
        gp.add(new NumberButton("."), 1,3);
        gp.add(new NumberButton("="), 2,3);
        gp.add(new NumberButton("+"), 3,3);

        Scene scene = new Scene(bp,300,400);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class NumberButton extends Button {
        public String val = "";

        NumberButton (String val) {
            super(val);
            this.val = val;
            prefHeightProperty().bind(gp.heightProperty().divide(4));
            prefWidthProperty().bind(gp.widthProperty().divide(4));
            setOnAction(e -> {txtDisplay.setText(txtDisplay.getText() + this.getText());});
        }
    }
}


