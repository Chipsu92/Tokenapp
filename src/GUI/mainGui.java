package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class mainGui extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        //Initialize primary stage

     Controller initialize = new Controller();
     initialize.handleMainStageInitialization();

    }

}
