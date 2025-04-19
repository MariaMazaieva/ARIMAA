package cz.cvut.fel.pjv.arimaa.engine.game;

import cz.cvut.fel.pjv.arimaa.engine.board.Board;
import cz.cvut.fel.pjv.arimaa.engine.player.Player;
import cz.cvut.fel.pjv.arimaa.engine.player.PlayerColor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
    public final GameMode gameMode;

    private Board board;
    private Player[] players;
    private String name;
    private List<Move> moves;

    /**
     * Sets game mode (human vs human or human vs AI)
     * according to user's choice (will be gotten from gui)
     */

    public Game(GameMode gameMode){
        this.gameMode = gameMode;

        this.players = new Player[2];
        this.players[PlayerColor.WHITE.getColor()] = new Player (PlayerColor.WHITE);
        this.players[PlayerColor.BLACK.getColor()] = new Player (PlayerColor.BLACK);

        this.board = new Board(this.players[PlayerColor.WHITE.getColor()].getPieces(),
                this.players[PlayerColor.BLACK.getColor()].getPieces());

        this.name = new Date().toString();
        this.moves = new ArrayList<Move>();
    }

    /**
     * Sets game name (needed for saving)
     * @param name
     */
    public void setName (String name){
        return ;
    }

    /**Sets time limit
     *
     * @param timeLimit
     */
    public void setTimeLimit (int timeLimit){
        for (Player player : players){
            player.getTimer().setTimeLimit(timeLimit);
        }
    }

    public Board getBoard(){
        return board;
    }

    public Player getWinner(){
        return null;
    }

    public String getName() {
        return name;
    }

    /**
     * Starts a loop for players to make moves.
     * Loop continues until some of the players
     * does not have valid moves
     */
    public void startGame() {
        return ;
    }

    /**
     * Saves game to a file with name of game.name
     * using arimaa notation
     */
    public boolean saveGame(){
        return false;
    }

    /**
     * Immediately ends game
     */
    public void endGame(){
        return ;
    }
}
