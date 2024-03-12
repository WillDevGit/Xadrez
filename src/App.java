import boardgame.*; 
import chess.*; 

public class App {
    public static void main(String[] args) throws Exception {
        
        //Position p = new Position(8, 8);
        Board board = new Board(8, 8);
        ChessMatch chessMatch = new ChessMatch(); 
        UI.printBoard(chessMatch.getPieces());
    }
}
