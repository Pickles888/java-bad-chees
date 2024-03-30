package src;

import java.util.ArrayList;

public class Position {
    private int x;
    private int y;
    private String chessNotation;
    public String[] split;
    
    public Position(String chessNotation) {
        this.chessNotation = chessNotation;
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        // separate the 2 parts of the notation
        //  - split the string into an array
        //  - create 2 new varibles from parts of that array (both chars)

        // get the y position
        //  - cast the second part (the number) from type char to type int
        //  - assign that to the y value

        // get the x position
        //  - make the letter lower case
        //  - find the index of that letter in the letters array and assign that to the x value

        String[] chessNotationSplit = chessNotation.split("");


    }

    public int getX() {
        // return the x member varible
    }

    public int getY() {
        // return the y member varible
    }
}