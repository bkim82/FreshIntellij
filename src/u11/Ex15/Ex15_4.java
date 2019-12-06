package u11.Ex15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex15_4 extends Application {

    public void start(Stage primaryStage) {

        BorderPane borderPane = new BorderPane();
        FlowPane FlowPane = new FlowPane(20, 20);
        HBox buttonHolder = new HBox(20);

        borderPane.setCenter(FlowPane);
        FlowPane.setAlignment(Pos.CENTER);
        borderPane.setBottom(buttonHolder);
        buttonHolder.setAlignment(Pos.CENTER);

        Label number1 = new Label("First: ");
        TextField one = new TextField();

        Label number2 = new Label("Second: ");
        TextField second = new TextField();

        Label result = new Label("Result: ");
        TextField answer = new TextField();

        Button add = new Button("Add");
        Button subtract = new Button("Subtract");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");

        FlowPane.getChildren().addAll(number1, one, number2, second, result, answer);
        buttonHolder.getChildren().addAll(add, subtract, multiply, divide);


        add.setOnAction(e -> {
            double x = Double.parseDouble(one.getText());
            double y = Double.parseDouble(second.getText());
            answer.setText(String.format("%.3f", x+y));
        });

        subtract.setOnAction(e -> {
            double x = Double.parseDouble(one.getText());
            double y = Double.parseDouble(second.getText());
            answer.setText(String.format("%.3f", x-y));
        });

        multiply.setOnAction(e -> {
            double x = Double.parseDouble(one.getText());
            double y = Double.parseDouble(second.getText());
            answer.setText(String.format("%.3f", x*y));
        });

        divide.setOnAction(e -> {
            double x = Double.parseDouble(one.getText());
            double y = Double.parseDouble(second.getText());
            answer.setText(String.format("%.3f", x/y));
        });

        Scene scene = new Scene(borderPane, 900, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        borderPane.requestFocus();
    }
}