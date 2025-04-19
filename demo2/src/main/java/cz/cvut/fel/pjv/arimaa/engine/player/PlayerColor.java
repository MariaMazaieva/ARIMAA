package cz.cvut.fel.pjv.arimaa.engine.player;

public enum PlayerColor {
    WHITE(0),
    BLACK(1);

    private int color;
    PlayerColor(int color){
        this.color = color;
    }

    @Override
    public String toString(){
        if (color == 0) return "white";
        else return "black";
    }

    public int getColor (){
        return color;
    }
}
