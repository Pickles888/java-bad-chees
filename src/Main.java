package src;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Piece piece = new Piece(1, 1, true, 'e', board);
        
        board.printBoard();

    }
}