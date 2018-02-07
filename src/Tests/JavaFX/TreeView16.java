package Tests.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeView16 extends Application{

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Tytul");

        TreeItem<String> root, beer, whisky;

        root = new TreeItem<>();
        root.setExpanded(true);

        beer = makeBranch("Beer",root);
        makeBranch("Lech", beer);
        makeBranch("Warka", beer);
        makeBranch("Heineken", beer);

        whisky = makeBranch("Whisky",root);
        makeBranch("Johny Walkier", whisky);
        makeBranch("Famous Goose", whisky);
        makeBranch("John Daniels", whisky);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);




        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300,200);
        window.setScene(scene);
        window.show();


    }

    public TreeItem<String> makeBranch (String title, TreeItem<String> parent) {

        TreeItem<String> item = new TreeItem<String>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
 }
