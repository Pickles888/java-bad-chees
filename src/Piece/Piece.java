package src.Piece;

import src.Position;

public class Piece {
    private Position pos;
    private boolean isAlive;
    private boolean isBlack;
    private char pieceChar;

    protected Piece(int x, int y, boolean isBlack) {
        this.pos = new Position(x, y, this);
        this.isBlack = isBlack;
        this.isAlive = true;
    }

    public void move() throws Exception {
        throw new Exception("Override This");
    }
    
    public void killPiece() {
        this.isAlive = false;
    }
}