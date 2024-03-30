package src.Piece;

import src.Position;

public class Piece {
    // add a member varible to set the letter that will represent the piece on the board
    // also make sure you add that to the constructor

    private Position position;
    private boolean isAlive;
    private boolean isBlack;

    protected Piece(Position position, boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
    }

    public void move() throws Exception {
        throw new Exception("Override This");
    }
    
    public void killPiece() {

    }

    // implement method to get position
}