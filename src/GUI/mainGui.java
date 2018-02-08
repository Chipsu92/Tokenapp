package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
fx:id " "
fx:id = "anchorPane" - AnchorPane
fx:id = "headerLabel" - TokenAPP
fx:id = "startButton" -start button
fx:id = "statisticButton" - statistic button
fx:id = "exitButton" - exit button
fx:id = "creditsLabel" - credits label
fx:id = "textArea" - text box
fx:id = "eventArea" -event box
fx:id = "signinButton" - sign in button
fx:id = "signinLabel" - sign in label
fx:id = "textLabel" - textbox label
fx:id = "terminalLabel" - terminalbox label

*/



public class mainGui extends Application {

    Stage window;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Calling fxml file
        Parent root = FXMLLoader.load(getClass().getResource("BasicApplication.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }
}
