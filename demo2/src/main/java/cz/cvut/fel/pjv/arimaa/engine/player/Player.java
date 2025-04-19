package cz.cvut.fel.pjv.arimaa.engine.player;

import cz.cvut.fel.pjv.arimaa.engine.pieces.Piece;
import cz.cvut.fel.pjv.arimaa.engine.pieces.PieceType;
import cz.cvut.fel.pjv.arimaa.engine.timer.Timer;
import cz.cvut.fel.pjv.arimaa.engine.board.Position;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected final PlayerColor color;
    protected final Timer timer;
    protected List<Piece> pieces;

    protected int rabbitLeft = 8;
    protected int catLeft = 2;
    protected int dogLeft = 2;
    protected int horseLeft = 2;
    protected int camelLeft = 1;
    protected int elephantLeft = 1;

    public Player(PlayerColor color){
        this.color = color;
        this.timer = new Timer();

        this.pieces = new ArrayList<Piece>();

        for (int i = 0; i < rabbitLeft; ++ i) this.pieces.add(new Piece (color, PieceType.RABBIT));
        for (int i = 0; i < catLeft; ++ i) this.pieces.add(new Piece (color, PieceType.CAT));
        for (int i = 0; i < dogLeft; ++ i) this.pieces.add(new Piece (color, PieceType.DOG));
        for (int i = 0; i < horseLeft; ++ i) this.pieces.add(new Piece (color, PieceType.HORSE));
        for (int i = 0; i < camelLeft; ++ i) this.pieces.add(new Piece (color, PieceType.CAMEL));
        for (int i = 0; i < elephantLeft; ++ i) this.pieces.add(new Piece (color, PieceType.ELEPHANT));
    }

    public int getColor(){
        return color.getColor();
    }

    public Timer getTimer(){
        return timer;
    }

    public Piece chooseMovePiece(){
        return null;
    } //???

    public Position chooseMovePosition(){
        return null;
    }; //???

    public List<Piece> getPieces(){
        return pieces;
    }

}
