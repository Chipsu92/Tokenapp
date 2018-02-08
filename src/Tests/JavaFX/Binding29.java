/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Binding29 extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Title");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue() +"\ny: " +y.getValue());

        x.setValue(9);
        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue() +"\ny: " +y.getValue());


        button = new Button("Click on this button");

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
*/
