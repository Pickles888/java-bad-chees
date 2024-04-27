package javaBadChees;

public class App {
    public static void main(String[] args) {
        Board board = new Board();
        Piece piece = new Piece(1, 1, true, 'e', board);
        
        board.printBoard();

    }
}
