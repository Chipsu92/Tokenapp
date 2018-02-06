/*
package Tests.JavaFX;

        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.layout.VBox;
        import javafx.stage.Modality;
        import javafx.stage.Stage;
        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.layout.StackPane;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

        import java.awt.*;

public class Alertbox {

    public static void display(String title, String msg) {

        Stage window = new Stage();
        //Unable to proceed further until this window is processed.
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);


        Label label = new Label("This is label");
        label.setText(msg);
        Button closeButton = new Button("Close window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(40);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.BASELINE_CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}
*/
