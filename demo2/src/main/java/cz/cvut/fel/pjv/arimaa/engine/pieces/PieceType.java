package cz.cvut.fel.pjv.arimaa.engine.pieces;

public enum PieceType {
    RABBIT(1),
    CAT(2),
    DOG(3),
    HORSE(4),
    CAMEL(5),
    ELEPHANT(6);

    public final int strength;

    PieceType (int strength){
        this.strength = strength;
    }

    public int getStrength (){
        return strength;
    }
}
