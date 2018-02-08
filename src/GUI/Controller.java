package GUI;

import javafx.application.Platform;
import javafx.scene.control.Button;

/*
fx:id = "anchorPane" - AnchorPane
fx:id = "headerLabel" - TokenAPP
fx:id = "startButton" -start button
fx:id = "statisticButton" - statistic button
fx:id = "exitButton" - exit button
fx:id = "creditsLabel" - credits label
fx:id = "textArea" - text box
fx:id = "eventArea" -event box
fx:id = "signinButton" - sign in button
fx:id = "signinLabel" - sign in label
fx:id = "textLabel" - textbox label
fx:id = "terminalLabel" - terminalbox label
*/


//Controls BasicApplication
public class Controller {

    public Button startButton;
    public Button  statisticButton;
    public Button exitButton;
    public Button signinButton;

   //Handle button click
    public void handleButtonClick() {

        startButton.setOnAction(e -> System.out.println("Magic"));
        statisticButton.setOnAction(e -> System.out.println("statistics"));
        signinButton.setOnAction(e -> System.out.println("sign in"));
        exitButton.setOnAction(e -> Platform.exit());

    }
}
