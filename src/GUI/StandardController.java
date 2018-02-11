package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class StandardController  {


    @FXML TextField textField;
    @FXML PasswordField passwordField;

    static boolean ifSignedIn = false;  // TODO: 10.02.2018 boolean change to true after successful attempt to login to snow and token site
    static String standardUsernameHolder;
    static String standardPasswordHolder;


    public static String getStandardPasswordHolder() {
        return standardPasswordHolder;
    }

    public static void setStandardPasswordHolder(String standardPasswordHolder) {
        StandardController.standardPasswordHolder = standardPasswordHolder;
    }

    public static String getStandardUsernameHolder() {
        return standardUsernameHolder;
    }

    public static void setStandardUsernameHolder(String standardUsernameHolder) {
        StandardController.standardUsernameHolder = standardUsernameHolder;
    }

    //Handles if logged in, if yes start method is accessable
    public static void setIfSignedIn(boolean ifSignedIn) {
        StandardController.ifSignedIn = ifSignedIn;
    }

    public static boolean isIfSignedIn() {
        return ifSignedIn;
    }

    //Call Standard Login screen
    public void standardLoginSceen() throws IOException {

        Stage standardStage = new Stage();
        standardStage.setTitle("Standard Login Screen");
        Parent root = FXMLLoader.load(getClass().getResource("StandardSignGui.fxml"));
        standardStage.initModality(Modality.APPLICATION_MODAL);
        standardStage.setScene(new Scene(root));
        standardStage.show();


    }

    //Handles Submit button
    public void handleSubmitButton () {


        //Collecting and setting username into standardUsernameHolder
        String usernName = textField.getText();
        setStandardUsernameHolder(usernName);

        //Collecting and setting password into standardPasswordHolder
        String password = passwordField.getText();
        setStandardPasswordHolder(password);

     }

}

