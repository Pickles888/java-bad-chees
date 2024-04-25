package src;

import src.Piece.Piece;
import src.Position;

public class Board {
    private Position[][] positions = new Position[8][8];

    public Board() {
        for (int i = 0; i <=8; i++) {
            for (int j = 0; j <=8; j++) { 
                this.positions[i][j] = new Position(i, j, null);
            }
        }
    }

    // add a return type to this function (line below)
    public int[] printBoard() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; i <= 8; i++) {
                
            }
        }

        // make a nested for loop to iterate through each value in piece, which should be null
        // the following comments should be actions taken within this loop ( - - is the inner loop, - is the outer loop)
        //  - - check if the piece is null, if so print out a empty space
        //  - - otherwise get the charcter to represent the piece
        //  - - print out what needs to be printed, make sure that you are printing on the same line, no line breaks
        //  - print a line break and go to the next row
    }
}