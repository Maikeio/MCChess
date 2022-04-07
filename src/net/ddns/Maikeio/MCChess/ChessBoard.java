package net.ddns.Maikeio.MCChess;

import java.util.concurrent.ThreadLocalRandom;

public class ChessBoard {
	private ChessPlayer whitePlayer;

	private ChessPlayer blackPlayer;
	
	
	public ChessBoard(String FirstPlayer){
		this.whitePlayer = new ChessWhitePlayer(this);
		this.blackPlayer = new ChessBlackPlayer(this);
		
		if (ThreadLocalRandom.current().nextInt(0, 1 + 1) == 1) {
			this.whitePlayer.setPlayerName(FirstPlayer);
		}else {
			this.blackPlayer.setPlayerName(FirstPlayer);
		}
	}
	
	Boolean isFreeSpace(int x, int y){
		return this.whitePlayer.isPieceAt(x,y) || this.whitePlayer.isPieceAt(x,y);
	}

	public void setSecondPlayer(String string) {
		if (this.whitePlayer.getPlayerName() == null) {
			this.whitePlayer.setPlayerName(string);
		} else {
			this.blackPlayer.setPlayerName(string);
		}
	}
	
	public ChessPlayer getWhitePlayer() {
		return whitePlayer;
	}

	public ChessPlayer getBlackPlayer() {
		return blackPlayer;
	}


}
