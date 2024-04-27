package src;

import java.util.HashMap;

public class Position {
    public Piece piece;
    public int x;
    public int y;

    private static char getArrayChar(String arrayChar) {
        return arrayChar.charAt(0);
    }

    public Position(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public Position(String chessNotation) {
        char chessNotationPiece;
        int chessNotationLocationNum;
        char chessNotationLocationChar;
        char[] charList = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        String[] chessNotationSplit = chessNotation.split("(?!^)");
        chessNotationPiece = getArrayChar(chessNotationSplit[0]);
        chessNotationLocationChar = getArrayChar(chessNotationSplit[1]);
        chessNotationLocationNum = Integer.parseInt(chessNotationSplit[2]);

        HashMap<Character, Integer> chessNotationCharMap = new HashMap<Character, Integer>();
        for (int i = 0; i <= 7; i++) {
            chessNotationCharMap.put(charList[i], i);
        }

        this.x = chessNotationCharMap.get(chessNotationLocationChar);
        this.y = chessNotationLocationNum;
    }
}