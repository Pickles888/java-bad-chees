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

        String[] chessNotationSplit = chessNotation.split("(?<=\\D)(?=\\d)");
    }

    public int getX() {

    }

    public int getY() {

    }
}