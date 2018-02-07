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

        //File Menu
        Menu fileMenu = new Menu("_File");

        //Menu items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("You clicked new Button"));
        fileMenu.getItems().addAll(newFile);

        fileMenu.getItems().add(new MenuItem("New..."));
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        //Separator
        fileMenu.getItems().addAll(new SeparatorMenuItem());
        //*********
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new MenuItem("Exit"));

        //Edit menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Paste"));
        editMenu.getItems().addAll(new SeparatorMenuItem());
        editMenu.getItems().add(new MenuItem("Find"));
        editMenu.getItems().add(new MenuItem("Macros"));

        //Help menu
        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            //checked if selected
            if(showLines.isSelected()) {

                System.out.println("Program will now display line numbers...");
            } else {

                System.out.println("Hiding line numbers...");
            }

        });
        //Selected by default
        CheckMenuItem autoSave = new CheckMenuItem("Enable autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);


        //disabled button
        MenuItem disabledButton = new MenuItem("Wykurwiaj");
        disabledButton.setOnAction(e -> System.out.println("Wykurwiam"));
        disabledButton.setDisable(true);
        fileMenu.getItems().addAll(disabledButton);


        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400,200);
        window.setScene(scene);
        window.show();

    }
}
