package src;

import src.Piece.Piece;

public class Position {
    public Piece piece;
    public int x;
    public int y;

    
    public Position(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }
}