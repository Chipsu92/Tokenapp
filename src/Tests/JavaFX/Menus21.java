package Tests.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Menus21 extends Application {

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Title");

        //FIle Menu
        Menu fileMenu = new Menu("File");

        //Menu items
        fileMenu.getItems().add(new MenuItem("New Project..."));
        fileMenu.getItems().add(new MenuItem("New Module..."));
        fileMenu.getItems().add(new MenuItem("Settings..."));

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400,200);
        window.setScene(scene);
        window.show();

    }
}
