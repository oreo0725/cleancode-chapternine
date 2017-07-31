package com.cleancode.chapternine;

/**
 * @author zen
 * @since 2017/08/01
 */
public class TennisGame {
    private Player player1;

    public TennisGame(String player1Name,
                      String player2Name) {
        player1 = new Player(player1Name);
    }

    public String getScore() {
        if(player1.getScore() > 0) {
            return player1.getPlayerName() + " advantage";
        }
        return "LOVE all";
    }

    public void score(String playerName) {
        player1.score();
    }
}
