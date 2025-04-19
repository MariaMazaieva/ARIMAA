package cz.cvut.fel.pjv.arimaa.engine.board;

public class Position {
    private int row;
    private int column;

    public static final Position[] PossiblePositionChanges = new Position[]{
            new Position(1, 0), new Position(0,1),
            new Position(-1, 0), new Position(0, -1)
    };

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void update (int newRow, int newColumn){
        row = newRow;
        column = newColumn;
    }

    public int getRow(){
        return row;
    }

    public int getColumn (){
        return column;
    }

    public Position sum (Position other){
        return new Position(row + other.getRow(), column + other.getColumn());
    }

    public Position sub (Position other){
        return new Position(row - other.getRow(), column - other.getColumn());
    }

    @Override
    public boolean equals (Object o){
        if (!(o instanceof Position)) return false;
        else{
            return (row == ((Position) o).getRow() && column == ((Position) o).getColumn());
        }
    }

    @Override
    public String toString(){
        return String.format("(" + row + ", " + column + ")");
    }

    public Position mulInt (int number){
        return new Position(row * number, column * number);
    }

    public boolean isOnBoard (){
        return row >= 0 && row < 8 && column >= 0 && column < 8;
    }
}
