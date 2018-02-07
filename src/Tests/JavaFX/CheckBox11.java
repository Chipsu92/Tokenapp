/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class CheckBox11 extends Application  {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("What do you want for drink");

        //Checkbox

        CheckBox box1 = new CheckBox("Beer");
        CheckBox box2 = new CheckBox("Wodka");
        // If you want to have box selected by default
        box1.setSelected(true);





        //Button
        button = new Button("Just give me that");
        button.setOnAction(e -> {

            handleOptions(box1,box2);

        });

        //layout

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20, 20,20));
        layout.getChildren().addAll(button, box1, box2);

        scene = new Scene(layout, 300,200);
        window.setScene(scene);
        window.show();




    }
    //Handle checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2) {

        String msg = "beveridge";

        if(box1.isSelected()) {
            System.out.println("Cold Beer");
        }

        if(box2.isSelected())  {

            System.out.println("Wodeczka it is");
        }


    }
}
*/
