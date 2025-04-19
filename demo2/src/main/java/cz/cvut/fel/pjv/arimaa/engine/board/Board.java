package cz.cvut.fel.pjv.arimaa.engine.board;

import cz.cvut.fel.pjv.arimaa.engine.pieces.*;
import cz.cvut.fel.pjv.arimaa.engine.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board{
    public static final int SIDE_LEN = 8;
    private List<Piece> whitePieces;
    private List<Piece> blackPieces;
    private boolean[][] tiles = new boolean[SIDE_LEN][SIDE_LEN];

    public Board(List<Piece> whitePieces, List<Piece> blackPieces){
        this.whitePieces = whitePieces;
        this.blackPieces = blackPieces;

        for (int row = 0; row < SIDE_LEN; ++ row){
            for (int col = 0; col < SIDE_LEN; ++ col){
                tiles[row][col] = true;
            }
        }
    }

    public List<Piece> getWhitePieces(){
        return whitePieces;
    }

    public List<Piece> getBlackPieces(){
        return blackPieces;
    }

    public List<Position> getValidMoves (Piece piece){
        List<Position> moves = new ArrayList<>();

        if (piece.getStrength() != PieceType.RABBIT.getStrength()){
            for (Position pos : Position.PossiblePositionChanges){
                Position newPosition = piece.getPosition().sum(pos);
                if (newPosition.isOnBoard() && tileIsFree(newPosition))
                    moves.add(newPosition);
            }
        }

        else {
            for (Position pos : Position.PossiblePositionChanges){
                if (pos.getRow() != -piece.getMovementDirection()) {
                    Position newPosition = piece.getPosition().sum(pos);
                    if (newPosition.isOnBoard() && tileIsFree(newPosition))
                        moves.add(newPosition);
                }
            }
        }
        return moves;
    }

    public void makeMove(Piece piece, Position newPosition){
        boolean isValid = false;

        for (Position pos : getValidMoves(piece)){
            if (newPosition.equals(pos)){
                isValid = true;
                break;
            }
        }

        if (!isValid){
            System.out.println("ERROR: The move to " + newPosition + " for the piece " + piece +
                    " is not valid!");
            return ;
        }

        if (tileIsFree(newPosition)){
            if (piece.getPosition().getRow() != -1 && piece.getPosition().getColumn() != -1)
                freeTile(piece.getPosition());
            piece.updatePosition(newPosition);
            takeTile(newPosition);
        }
        else{
            System.out.println("ERROR: The tile " + newPosition + "is already taken");
        }
    }

    public void takeTile (Position pos){
        tiles[pos.getRow()][pos.getColumn()] = false;
    }

    public void freeTile (Position pos){
        tiles[pos.getRow()][pos.getColumn()] = true;
    }

    public boolean tileIsFree (Position pos){
        return tiles[pos.getRow()][pos.getColumn()];
    }

    public boolean canMakeMove (Player player){
        return false;
    }

}
