/*
package Tests.JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class ListView15 extends Application {

    Scene scene;
    Stage window;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Title");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll(

                "Vodka",
                "Beer",
                "Whisky"

        );
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button, listView);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();


    }
    private void buttonClicked() {

        String msg = "";
        ObservableList<String> alcohol;
        alcohol = listView.getSelectionModel().getSelectedItems();

        for(String a: alcohol) {
            msg += a +"\n";
            System.out.println(msg);
        }

    }

}
*/
