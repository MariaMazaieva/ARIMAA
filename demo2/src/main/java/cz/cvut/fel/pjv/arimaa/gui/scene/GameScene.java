package cz.cvut.fel.pjv.arimaa.gui.scene;

import cz.cvut.fel.pjv.arimaa.engine.board.Board;
import cz.cvut.fel.pjv.arimaa.gui.renderer.GameRenderer;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameScene extends Scene {

    public GameScene(Stage stage, GameRenderer renderer){
        super(renderer.createBoard(), 11 * GameRenderer.TILE_SIZE, 11 * GameRenderer.TILE_SIZE);
    }


}
