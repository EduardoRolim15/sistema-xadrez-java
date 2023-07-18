package application;

import Chess.ChessMatch;
import boardgame.Board;
import boardgame.Position;

public class program {

	public static void main(String[] args) {

		ChessMatch CM = new ChessMatch();
		UI.printBoard(CM.getPieces());
	}
}
