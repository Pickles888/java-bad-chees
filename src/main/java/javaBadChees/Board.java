package javaBadChees;

public class Board {

    private static Board instance;
    public static Board getBoard() {
        if (instance == null)
            instance = new Board();

        return instance; 
    }

    private Piece[][] pieceArray = new Piece[8][8];

    public void printBoard() {
        for (int i = 0; i < pieceArray.length; i++) {
            for (int j = 0; j < pieceArray[0].length; j++) {
                Piece piece = pieceArray[i][j];

                if (piece == null) {
                    System.out.print("[ ]");
                    continue;
                }

                System.out.print("[" + piece.pieceChar + "]");
            }
            
            System.out.println();
        }
    }

    public void addPiece(Piece piece) {
        pieceArray[piece.pos.x][piece.pos.y] = piece;
    }
}
