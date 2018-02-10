package GUI;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StandardController {

    public Button submitButton;
    public TextField textField;
    public PasswordField passwordField;
    public AnchorPane anchorPaneStand;
    public Stage stage;

    //Handles Submit button
    public void HandleSubmitButton() throws IOException {

        Stage newStage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("PrvSignGui.fxml"));
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(root));
        newStage.show();

        submitButton.setOnAction(e -> stage.hide());

     }





}

