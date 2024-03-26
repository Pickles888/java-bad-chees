package src.Piece;

import src.Position;

public class Piece {
    private Position position;
    private boolean isAlive;
    private boolean isBlack;

    protected Piece(Position position, boolean isBlack) {
        this.position = position;
        this.isBlack = isBlack;
    }

    public void move() throws Exception {
        throw new Exception("Override This Bean");

    } //??????
    
    public void killPiece() {

    }
}