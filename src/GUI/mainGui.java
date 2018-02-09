package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class mainGui extends Application {



    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Calling fxml file
        Parent root = FXMLLoader.load(getClass().getResource("BasicApplication.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Token distribution App, I am the god");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }
}
