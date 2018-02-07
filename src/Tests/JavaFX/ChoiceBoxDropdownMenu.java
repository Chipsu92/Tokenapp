/*
package Tests.JavaFX;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxDropdownMenu extends Application  {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Just another title");
        button = new Button("Click here");

        ChoiceBox<String> choiceBox = new ChoiceBox<String>();

        //Get items, returns observableList object which you can add items to
        choiceBox.getItems().add("Beer");
        choiceBox.getItems().add("Vodka");
        choiceBox.getItems().addAll("Whiskey", "Wine", "Gin");

        //set default value
        choiceBox.setValue("Beer");

        //action while selected
        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();


    }

    private void getChoice(ChoiceBox<String> choiceBox) {

        String alcohol = choiceBox.getValue();
        System.out.println(alcohol);



    }
}
*/
