package net.ddns.Maikeio.MCChess;


import org.bukkit.plugin.java.JavaPlugin;


public class MCChess extends JavaPlugin{
		@Override
	    public void onEnable() {
			ChessBoard board = new ChessBoard("Player1");
			board.setSecondPlayer("Player2");

			getLogger().info("White: " + board.getWhitePlayer().getPlayerName() + ", Black: " + board.getBlackPlayer().getPlayerName());
	    }
	    // Fired when plugin is disabled
	    @Override
	    public void onDisable() {

	    }
	}
