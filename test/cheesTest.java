import java.util.HashMap;

public class cheesTest {

    private static char getArrayChar(String arrayChar) {
        return arrayChar.charAt(0);
    }

    public static void main(String[] args) {  
        char chessNotationPiece;
        boolean taking;
        int chessNotationLocationNum;
        char chessNotationLocationChar;
        char[] charList = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        String[] chessNotationSplit = "Nxd4".split("(?!^)");
        chessNotationPiece = getArrayChar(chessNotationSplit[0]); // The Piece

        if (chessNotationSplit[1].equals("x")) {
            taking = true;
            chessNotationLocationChar = getArrayChar(chessNotationSplit[2]); // The x char (offset for "x")
            chessNotationLocationNum = Integer.parseInt(chessNotationSplit[3]); // the y int (offset for "x")
        } 
        for (int i : charList) {
            else if (chessNotationSplit[1].equals(charList[i]))
        }
        else {
            chessNotationLocationChar = getArrayChar(chessNotationSplit[1]); // The x char
            chessNotationLocationNum = Integer.parseInt(chessNotationSplit[2]); // the y char
        }

        HashMap<Character, Integer> chessNotationCharMap = new HashMap<Character, Integer>();
        for (int i = 0; i <= 7; i++) {
            chessNotationCharMap.put(charList[i], i);
        }

        System.out.println(chessNotationPiece);
        System.out.println(chessNotationCharMap.get(chessNotationLocationChar));
        System.out.println(chessNotationLocationNum);
    }
}