import javax.swing.JFrame;

import boardgame.*; 
import chess.*; 

public class App {
    public static void main(String[] args) throws Exception {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
      
    }
}
