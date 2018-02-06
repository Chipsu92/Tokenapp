package Tests.JavaFX;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//extends WorkingWFrames


public class ClosingProgramProperly extends Application {

    Stage window;
    Button button;


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("JavaFX");
        window.setOnCloseRequest(event -> closeProgram());

        button = new Button("Close program");
        button.setOnAction(e -> closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 200);
        window.show();
        window.setScene(scene);


        }

        private void closeProgram() {

           Boolean answer = Confirmbox.display("Title Box", "Are you sure?");

           if(answer){

               window.close();

           }

        }

}

