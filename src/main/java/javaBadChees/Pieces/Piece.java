package javaBadChees;

public class Piece {
    public Position pos;
    protected boolean isAlive;
    protected boolean isBlack;
    public char pieceChar;
    protected Board board;

    protected Piece(int x, int y, boolean isBlack, char pieceChar, Board board) {
        this.pos = new Position(x, y, this);
        this.isBlack = isBlack;
        this.isAlive = true;
        this.pieceChar = pieceChar;
        this.board = board;

        this.board.addPiece(this);
    }

    public void move() {
        board.removePiece(this);
        pos.x++;
        board.addPiece(this);
    }
    
    public void killPiece() {
        this.isAlive = false;
    }
}
