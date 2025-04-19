package cz.cvut.fel.pjv.arimaa.gui.scene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainScene extends Scene {
    public MainScene(Stage stage, Scene gameScene) {
        super(new VBox(10), 500,500);

        VBox box = (VBox) getRoot(); //box for the menu in the middle
        //loads ok on mac, on linux nok
        this.getStylesheets().add(getClass().getResource("/mainStyle.css").toExternalForm());

        Label label = new Label("Let's play Arimaa!");
        label.getStyleClass().add("label-title");
        Button newGame = new Button("New game");
        Button loadGame = new Button("Load game");
        Button settings = new Button("Settings");
        Button saveGame = createButton("Save game");
        Button quit = new Button("Quit");

        newGame.getStyleClass().add("button-main");

        newGame.setOnAction(actionEvent -> {//WHAT DOES  IT DO, oh got it
            stage.setScene(gameScene);
        });

        loadGame.setOnAction(e -> ShowLoadGame (stage));
        settings.setOnAction(e -> ShowSettings (stage));
        quit.setOnAction(e -> EndGame (stage));
        saveGame.setOnAction( e -> SaveTheGame(stage));

//        label.setPadding(new Insets(20));
        box.setMargin(label, new Insets(10));

        box.getChildren().addAll(label, newGame, loadGame,saveGame, settings, quit);
        box.setAlignment(Pos.CENTER);
    }

    private void ShowLoadGame(Stage owner){
        // 1. Stackpane
        StackPane root = new StackPane();

        // 2. box for the title
        VBox vbox = new VBox();
        Label label = new Label("This is a window that loads games");
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.TOP_CENTER);
        Scene scene = new Scene(vbox, 500, 500);

        // 3. Stage, name and set Scene
        Stage stage = new Stage();
        stage.setTitle("Load game");
        stage.setScene(scene);

        // Show-off funcs.
        // Do not allow user to click on the menu before closing the LoadGame window.
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(owner);
        stage.showAndWait();
    }
    private void ShowSettings(Stage owner){
        // 1. Stackpane
        StackPane root = new StackPane();

        // 2. box for the title
        VBox vbox = new VBox();
        Label label = new Label("This is a window that loads settings");
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.TOP_CENTER);
        Scene scene = new Scene(vbox, 500, 500);

        // 3. Stage, name and set Scene
        Stage stage = new Stage();
        stage.setTitle("Settings");
        stage.setScene(scene);

        // Show-off funcs.
        // Do not allow user to click on the menu before closing the LoadGame window.
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(owner);
        stage.showAndWait();
    }
    private void SaveTheGame(Stage owner){
        // Has a built-in OK and CANCEL buttons
        ChoiceDialog<String> dialog = new ChoiceDialog<>("PDF", "TXT", "AbraCadabra");
        dialog.setTitle("Saving the game...");
        dialog.setHeaderText("This is a WINDOW_MODAL dialog");
        dialog.setContentText("Choose an option:");

        // Set to window-modal (blocks only the parent window)
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(owner);

//        dialog.setGraphic(null); Removes question mark


        dialog.showAndWait().ifPresent(result -> {
            System.out.println("User chose: " + result);
        });
    }


    private void EndGame(Stage owner){
        owner.close();
    }



    private Button createButton(String text){
        Button button = new Button(text);
        button.setOnAction(actionEvent -> {
            Stage stage = new Stage();

        });
        return button;
    }
}
