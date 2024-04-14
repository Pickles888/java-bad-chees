package src;

public class Player {
    private boolean isBlack;

    public Player(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public void takeTurn(String chessNotation) {
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

        xpos = chessNotationCharMap.get(chessNotationLocationChar);
        ypos = chessNotationLocationNum;

    }
}