package GUI;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

//Controls BasicApplication
public class Controller {

    @FXML TextArea eventArea;
    public Button startButton;
    public Button statisticButton;
    public Button exitButton;
    public Button signinButton;


    //handle start button
    public void handleStartButton() {

        eventArea.setText("Test");

        if (StandardController.isIfSignedIn()) {

            System.out.println("Magic");
        } else System.out.println("You need to sign in first");

    }

    // handle statistics button
    public void handleStatisticsButton() {

        System.out.println("statistics");
        eventArea.setText("Stats");
    }

    //handle exit button
    public void handleExitButton() {

            Stage areYouSure = new Stage();
            areYouSure.setTitle("Are you sure you want to close Applicaiton ?");
            areYouSure.initModality(Modality.APPLICATION_MODAL);

            Button yesButton = new Button("Yes");
            Button noButton = new Button("No");
            yesButton.setOnAction(e ->Platform.exit());
            noButton.setOnAction(e ->areYouSure.close());

            Label label = new Label("Are you sure you want to close Applicaiton?");

            VBox layout = new VBox();
            layout.getChildren().addAll(label, yesButton, noButton);
            layout.setAlignment(Pos.TOP_CENTER);
            layout.setPadding(new Insets(10,10,10,10));
            Scene scene = new Scene(layout, 420,100);
            areYouSure.setScene(scene);
            areYouSure.show();
    }
     //initialize Loginscreen
    public void handleSignInClick() throws IOException {

        StandardController initialize = new StandardController();
        initialize.standardLoginSceen();

    }

    //Handle event area

    public void handleEventArea () {


    }
    //Call Primary Stage
    public void handleMainStageInitialization() throws IOException {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Token Application ");
        Parent root = FXMLLoader.load(getClass().getResource("BasicApplication.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
