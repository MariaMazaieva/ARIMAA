package cz.cvut.fel.pjv.arimaa.engine.game;

import cz.cvut.fel.pjv.arimaa.engine.pieces.Piece;
import cz.cvut.fel.pjv.arimaa.engine.board.Position;

public class Move {
    private int moveNumber;
    private final Piece piece;
    private final Position from;
    private final Position to;

    public Move(Piece piece, Position from, Position to){
        this.piece = piece;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString(){
        return String.format(piece.toString() + " was moved from " + from.toString() + " to " + to.toString());
    }
}
