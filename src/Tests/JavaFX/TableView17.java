package Tests.JavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// CLASS ALCOHOL EXTENDS THIS CLASS
public class TableView17 extends Application {

    Stage window;
    TableView<Alcohol> table;
    TextField nameInput, priceInput, quantityInput;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {


        window = primaryStage;
        window.setTitle("Title");

        //Columns
        TableColumn<Alcohol, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Alcohol, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(200);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //quantity column
        TableColumn<Alcohol, Integer> quantColumn = new TableColumn<>("Quantity");
        quantColumn.setMinWidth(200);
        quantColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        //Buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button removeButton = new Button("Remove");
        removeButton.setOnAction(e -> removeButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, removeButton);

        table = new TableView<>();
        table.setItems(getAlcohol());
        table.getColumns().addAll(nameColumn, priceColumn, quantColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);


        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }
    //Get all of the products
    public ObservableList<Alcohol> getAlcohol() {
        ObservableList<Alcohol> alcohol = FXCollections.observableArrayList();
        alcohol.add(new Alcohol("Beer",4.5,600));
        alcohol.add(new Alcohol("Vodka",25,140));
        alcohol.add(new Alcohol("Whisky",70,256));
        alcohol.add(new Alcohol("Wine",30,177));
        alcohol.add(new Alcohol("Gin",60,2));

        return alcohol;

    }

    public void addButtonClicked() {

        Alcohol alcohol = new Alcohol();
        alcohol.setName(nameInput.getText());
        alcohol.setPrice(Double.parseDouble(priceInput.getText()));
        alcohol.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(alcohol);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();

    }

    public void removeButtonClicked() {


    }

}
