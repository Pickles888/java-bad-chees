package src;

public class Piece {
    public Position pos;
    private boolean isAlive;
    private boolean isBlack;
    public char pieceChar;

    protected Piece(int x, int y, boolean isBlack, char pieceChar, Board board) {
        this.pos = new Position(x - 1, y - 1, this);
        this.isBlack = isBlack;
        this.isAlive = true;
        this.pieceChar = pieceChar;

        board.addPiece(this);
    }

    public void move() throws Exception {
        throw new Exception("Override This");
    }
    
    public void killPiece() {
        this.isAlive = false;
    }
}