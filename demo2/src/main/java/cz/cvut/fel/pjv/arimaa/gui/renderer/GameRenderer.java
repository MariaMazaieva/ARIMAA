package cz.cvut.fel.pjv.arimaa.gui.renderer;

import cz.cvut.fel.pjv.arimaa.engine.board.Board;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.scene.control.Label;

public class GameRenderer {
    public static final int TILE_SIZE = 80;
    private final Board board;

    public GameRenderer(Board board){
        this.board = board;
    }

    public BorderPane createBoard(){
        BorderPane layout = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);


        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
                if ((row + col) % 2 == 0) tile.setFill(Color.BLACK);
                else tile.setFill(Color.INDIANRED);

                final int r = row;
                final int c = col;

                tile.setOnMouseClicked(mouseEvent -> {
                    tile.setStroke(Color.RED);
                    tile.setVisible(true);
                });
                gridPane.add(tile, col, row);

            }
        }
        gridPane.setAlignment(Pos.CENTER_LEFT);
        Image rabbitImage = new Image ("Arimaa_rgb74.png");

        HBox bottomRabbits = createRabbitRow(rabbitImage);
        HBox topRabbits = createRabbitRow(rabbitImage);

        VBox undoTab = createUndoTab();
        layout.setRight(undoTab);
        layout.setMargin(undoTab, new Insets(10));

        layout.setTop(topRabbits);
        layout.setCenter(gridPane);
        layout.setBottom(bottomRabbits);

        return layout;
    }
    private HBox createRabbitRow(Image rabbitImage) {
        HBox rabbitRow = new HBox(5);
        rabbitRow.setAlignment(Pos.CENTER_LEFT);
        for (int i = 0; i < 8; i++) {
            ImageView rabbitView = new ImageView(rabbitImage);
            rabbitView.setFitWidth(TILE_SIZE * 0.8);
            rabbitView.setFitHeight(TILE_SIZE * 0.8);
            rabbitRow.getChildren().add(rabbitView);
        }
        return rabbitRow;
    }
    private VBox createUndoTab(){
        VBox undoTab = new VBox();
        undoTab.setAlignment(Pos.CENTER);
//        undoTab.setSpacing(5);

//        undoTab.setPadding(new Insets(10));
        undoTab.setPrefWidth(220);

        undoTab.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, null, null)));
//        Button undoButton = new Button("Undo");
        Label undoLabel = new Label("Undo");
        undoTab.getChildren().add(undoLabel);
        return undoTab;
    }
}
