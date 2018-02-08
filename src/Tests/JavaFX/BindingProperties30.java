/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BindingProperties30 extends Application {

    Stage window;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryScene) {

        window = primaryScene;
        window.setTitle("Title");

        //Input and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label firstLabel = new Label("Hardstyle");
        Label secondLabel = new Label();

        HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);


        VBox vBox = new VBox(10,userInput,bottomText);
        vBox.setAlignment(Pos.BOTTOM_CENTER);

        secondLabel.textProperty().bind(userInput.textProperty());

        Scene scene = new Scene(vBox, 300,200);
        window.setScene(scene);
        window.show();


    }
}
*/
