package cz.cvut.fel.pjv.arimaa;

import cz.cvut.fel.pjv.arimaa.engine.game.Game;
import cz.cvut.fel.pjv.arimaa.engine.game.GameMode;
import cz.cvut.fel.pjv.arimaa.engine.pieces.Piece;
import cz.cvut.fel.pjv.arimaa.engine.board.Position;
import cz.cvut.fel.pjv.arimaa.gui.renderer.GameRenderer;
import cz.cvut.fel.pjv.arimaa.gui.scene.GameScene;
import cz.cvut.fel.pjv.arimaa.gui.scene.MainScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Arimaa extends Application {
//    public static void main(String[] args) {
//        final int humanWithHuman = 0;
//        final int humanWithAI = 1;
//
//        //TEST
//        Game game = new Game(humanWithAI);
//        System.out.println("Game name: " + game.getName());
//
//        System.out.println("WHITE PIECES:");
////        for (Piece piece : game.getBoard().getWhitePieces()) System.out.println(piece.toString());
//
//        System.out.println(System.lineSeparator() + "BLACK PIECES");
////        for (Piece piece : game.getBoard().getBlackPieces()) System.out.println(piece.toString());
//
//        Piece currPiece = game.getBoard().getWhitePieces().get(2);
//        currPiece.putToBoard(new Position(0, 0));
//        game.getBoard().makeMove(currPiece, new Position(1,0));
//        System.out.println("The " + currPiece.toString());
//
//        currPiece = game.getBoard().getWhitePieces().get(3);
//        currPiece.putToBoard(new Position(1, 1));
//        game.getBoard().makeMove(currPiece, new Position(1,0));
//
//        currPiece = game.getBoard().getWhitePieces().get(4);
//        currPiece.putToBoard(new Position(1, 0));
//        game.getBoard().makeMove(currPiece, new Position(0,1));
//
//        currPiece = game.getBoard().getWhitePieces().get(2);
//        currPiece.putToBoard(new Position(0, 0));
//        System.out.println("\n" + game.getBoard().getValidMoves(currPiece));
//
//    }


    @Override
    public void start(Stage stage) throws Exception {
        Game game = new Game(GameMode.HumanVsHuman);
        GameRenderer renderer = new GameRenderer(game.getBoard());
        Scene gameScene = new GameScene(stage, renderer);
        Scene mainScene = new MainScene(stage, gameScene);
        stage.setTitle("ARIMAA");
        stage.setScene(mainScene);
        stage.show();
    }
}