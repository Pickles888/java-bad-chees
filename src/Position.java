package src;

import java.util.ArrayList;

public class Position {
    private int x;
    private int y;
    private String chessNotation;
    public String[] split;
    
    public Position(String chessNotation) {
        this.chessNotation = chessNotation;
        char chessNotationPiece;
        int chessNotationLocationNum;
        char chessNotationLocationChar;

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        // get the y position
        //  - cast the second part (the number) from type char to type int
        //  - assign that to the y value

        // get the x position
        //  - make the letter lower case
        //  - find the index of that letter in the letters array and assign that to the x value

        String[] chessNotationSplit = chessNotation.split("(?!^)");

        chessNotationPiece = chessNotationSplit[0].chatAt(0);
        chessNotationLocationNum = chessNotationSplit[2];


    }

    public int getX() {
        // return the x member varible
    }

    public int getY() {
        // return the y member varible
    }
}