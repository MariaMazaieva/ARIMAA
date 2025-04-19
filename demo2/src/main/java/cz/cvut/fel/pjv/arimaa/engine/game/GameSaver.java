package cz.cvut.fel.pjv.arimaa.engine.game;

import cz.cvut.fel.pjv.arimaa.engine.board.Board;
import cz.cvut.fel.pjv.arimaa.engine.player.Player;

public class GameSaver {
    private boolean gameIsEnded;
    private Game game;

    public GameSaver (boolean gameIsEnded, Game game){
        this.gameIsEnded = gameIsEnded;
        this.game = game;
    }
    //TODO
}
