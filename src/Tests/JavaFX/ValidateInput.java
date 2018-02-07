/*
package Tests.JavaFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class ValidateInput extends Application  {

    Stage window;
    Scene scene;
    Button button;


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("What is your name?");

        //Form

        TextField nameInput = new TextField();
        nameInput.setPromptText("password");
        button = new Button("Click me...");
        button.setOnAction( e -> {

           verify(nameInput,nameInput.getText());

           if(verify()){

               System.out.println("Input true");
           } else {
               System.out.println("Imput false");
           }
        });

        //Layout

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);

         scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();


    }

    public Boolean verify(TextField input, String message) {

        try {

            Objects.equals("MICHAL",input.getText().toUpperCase());
            System.out.println("You've provided correct name");
            return true;

            } catch(NumberFormatException e) {

            System.out.println("You have provided incorrect name\nCompiutor blocked...");
            return false;


        }








    }
}







*/
