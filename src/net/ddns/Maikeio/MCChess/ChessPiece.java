package net.ddns.Maikeio.MCChess;

public abstract class ChessPiece implements ChessMoveset{
	
	private int posX;
	private int posY;
	
	public ChessPiece(int x, int y){
		this.setPosX(x);
		this.setPosY(y);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
