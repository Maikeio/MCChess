package net.ddns.Maikeio.MCChess;

import net.ddns.Maikeio.MCChess.Pieces.ChessPawn;

public class ChessWhitePlayer extends ChessPlayer {

	public ChessWhitePlayer(ChessBoard board) {
		super(board);
		for (int x = 0; x < 8; x++) {
			this.activePices[x] = new ChessPawn(x,1);
		}
	}

}
