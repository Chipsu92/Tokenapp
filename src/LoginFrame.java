import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginFrame extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[] args) {

        launch(args);



    }

    @Override
    public void start(Stage primaryStage) {
                                                                                                           // whole window calls Stage
             primaryStage.setTitle("Token Application");                                                  // Scene is whole content inside Stage
        button = new Button();
        button.setText("Click me");

        button.setOnAction(script();)

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300, 250);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {


    }
    public static void script(){

    }
}
