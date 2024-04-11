public class cheesTest {
    public static void main() {
        char chessNotationPiece;
        int chessNotationLocationNum;
        char chessNotationLocationChar;
        String chessNotation = "Nf4";
        String[] chessNotationSplit = chessNotation.split("(?!^)");

        chessNotationPiece = chessNotationSplit[0].charAt(0);
        chessNotationLocationNum = Integer.parseInt(chessNotationSplit[2]);

        System.out.println(chessNotationPiece);
        System.out.println(chessNotationLocationNum);
    }
}