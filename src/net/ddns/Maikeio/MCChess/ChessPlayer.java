package net.ddns.Maikeio.MCChess;

public abstract class ChessPlayer {
	
	protected ChessBoard board;
	protected ChessPiece[] activePices;
	protected ChessPiece[] defeatedPices;
	private String playerName;
	
	public ChessPlayer(ChessBoard board){
		this.activePices = new ChessPiece[16];
		this.defeatedPices = new ChessPiece[15];
		this.board = board;
	}
	
	Boolean isPieceAt(int x, int y) {
		for (ChessPiece p : this.activePices){
			if (p.getPosX() == x & p.getPosY() == y) {
				return true;
			}
		}
		return false;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String player) {
		this.playerName = player;
	}
}
