/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//Extends from person
//Important for creating start button
public class Properties28 extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Title");

        Person michal = new Person();
        michal.firstNameProperty().addListener((v, oldValue, newValue) -> {

            System.out.println("Name changed to " + newValue);
            System.out.println("FirstNameProperty " + michal.firstNameProperty());
            System.out.println("getFirstName() " + michal.getFirstName());

        });

        button = new Button("Click on it...");
        button.setOnAction(e -> michal.setFirstName("Chips") );

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300,200);
        window.setScene(scene);
        window.show();


    }
}


*/
