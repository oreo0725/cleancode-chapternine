package com.cleancode.chapternine;

/**
 * @author zen
 * @since 2017/08/01
 */
public class Player {
    private final String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    private int score = 0;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void score() {
        score++;
    }
}
