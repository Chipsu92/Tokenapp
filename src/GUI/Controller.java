package GUI;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;



//Controls BasicApplication
public class Controller {

    public Button startButton;
    public Button  statisticButton;
    public Button exitButton;
    public Button signinButton;

   //Handle button click
    public void handleButtonClick() {

        startButton.setOnAction(e -> System.out.println("Magic"));
        statisticButton.setOnAction(e -> System.out.println("Statistics"));
        exitButton.setOnAction(e -> Platform.exit());

    }

    public void handleSignInClick() throws IOException {




        //handles sign in button click

            Stage newStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("StandardSignGUI.fxml"));
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(root));
        newStage.show();


     }


}
