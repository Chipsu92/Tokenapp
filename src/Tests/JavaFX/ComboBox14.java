/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ComboBox14 extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("This is tittle");
        button = new Button("Geez Rick...");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Vodka",
                         "Beer",
                         "Whiskey"

        );

        comboBox.setPromptText("What is your favorite drink");
        comboBox.setEditable(true);

        button.setOnAction(e -> printAlk());
        comboBox.setOnAction(e -> System.out.println("Let's drink some: " + comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,comboBox);

        scene = new Scene(layout, 250, 250);
        window.setScene(scene);
        window.show();


    }
  // CALLING VALUE FROM COMBO BOX.
    private void printAlk() {

        System.out.println(comboBox.getValue());
    }
}
*/
