package GUI;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
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


//Controls BasicApplication
public class Controller {

    public Button startButton;
    public Button  statisticButton;
    public Button exitButton;
    public Button signinButton;

   //Handle button click
    public void handleButtonClick() {

        startButton.setOnAction(e -> System.out.println("Magic"));
        statisticButton.setOnAction(e -> System.out.println("statistics"));
        exitButton.setOnAction(e -> Platform.exit());

    }

    public void handleSignInClick() {

        //handles sign in button click
        signinButton.setOnAction(e -> {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StandardSignGUI.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Standard account login screen");
            stage.setScene(new Scene(root1));
            stage.show();



        });



    }
}
