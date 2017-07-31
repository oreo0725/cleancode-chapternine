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
            return player1.getPlayerName() + " advantage";
        }
        else if(player2.getScore() > 0) {
            return player2.getPlayerName() + " advantage";
        }
        return "LOVE all";
    }

    public void score(String playerName) {
        if (playerName.equals(player1.getPlayerName()))
            player1.score();
        else
            player2.score();
    }
}
