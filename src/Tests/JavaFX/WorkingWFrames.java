/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkingWFrames extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        Label label1 = new Label("First scene");
        //Button 1
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2) );

        //Layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 200, 200);

        //Button2

        Button button2 = new Button("Scene two");
        button2.setOnAction(e -> window.setScene(scene1) );

        //Layout 2

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Test Title");
        window.show();
    }
}
*/
