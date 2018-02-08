package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mainGui extends Application {

    Stage window;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("TokenAPP ver 1.0");

        AnchorPane anchorPane = new AnchorPane();

        Button button = new Button("start");


        Scene scene = new Scene(anchorPane, 600, 400);
        scene.getStylesheets().add();
        window.setScene(scene);
        window.show();


    }
}
