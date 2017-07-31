package com.cleancode.chapternine;

/**
 * @author zen
 * @since 2017/08/01
 */
public class TennisGame {
    private Player player1;
    private Player player2;

    public TennisGame(String player1Name,
                      String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);

    }

    public String getScore() {
        if (player1.getScore() > 0) {
            return advantageMsg(player1);
        }
        else if(player2.getScore() > 0) {
            return advantageMsg(player2);
        }
        return "LOVE all";
    }

    private String advantageMsg(Player player) {
        return player.getPlayerName() + " advantage";
    }

    public void score(String playerName) {
        if (playerName.equals(player1.getPlayerName()))
            player1.score();
        else
            player2.score();
    }
}
