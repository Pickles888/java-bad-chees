package src;

import src.Piece.Piece;

public class Board {
    // turn this into a 2d array rather than 1d
    private Piece[] pieces; // you will need to change this line

    public Board() {
        // create a few pieces, make sure they are subclasses of piece and not piece itself
    }

    // add a return type to this function (line below)
    public printBoard() {

        // make a nested for loop to iterate through each value in piece, which should be null
        // the following comments should be actions taken within this loop ( - - is the inner loop, - is the outer loop)
        //  - - check if the piece is null, if so print out a empty space
        //  - - otherwise get the charcter to represent the piece
        //  - - print out what needs to be printed, make sure that you are printing on the same line, no line breaks
        //  - print a line break and go to the next row
}