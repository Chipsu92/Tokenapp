/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class MultipleWindow extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Main Title");

        button = new Button("Click me");
        button.setOnAction(e -> {

        boolean result = Confirmbox.display("Title of Window","Are you sure?");

            System.out.println(result);

        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene (layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
*/
