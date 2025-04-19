package cz.cvut.fel.pjv.arimaa.engine.pieces;

import cz.cvut.fel.pjv.arimaa.engine.board.Position;
import cz.cvut.fel.pjv.arimaa.engine.player.PlayerColor;

/*
Maybe to move the method "get valid moves" to this class??
Maybe to create classes for every piece??
 */

public class Piece implements Comparable<Piece>{
    private PieceType type;
    private Position position;
    private final PlayerColor color;
    private int movementDirection;
    private boolean isActive = true;

    public Piece(PlayerColor color, PieceType type){
        this.color = color;
        this.type = type;

        if (color == PlayerColor.WHITE) this.movementDirection = 1;
        else this.movementDirection = -1;
    }

    public void putToBoard (Position position){
        this.position = position;
    }

    public void updatePosition(Position newPosition){
        this.position = newPosition;
    }

    public Position getPosition(){
        return new Position (this.position.getRow(), this.position.getColumn());
    }

    public int getColor (){
        return color.getColor();
    }

    public int getStrength(){
        return type.getStrength();
    }

    public PieceType getType (){
        return this.type;
    }

    //if piece.getType() == PieceType.RABBIT : piece.setImage(RABBIT_img.png);

    public int getMovementDirection(){
        return movementDirection;
    }

    @Override
    public int compareTo(Piece p) {
        return Integer.compare(this.getStrength(), p.getStrength());
    }

    @Override
    public String toString(){
        return String.format(color.toString() + type + " " + position.toString());
    }
}
