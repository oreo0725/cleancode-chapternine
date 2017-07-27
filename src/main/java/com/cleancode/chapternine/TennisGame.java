package com.cleancode.chapternine;

public class TennisGame {
    private Player player1;
    private Player player2;
    private ScoreTranslator scoreTranslator;

    public TennisGame(String playerOneName, String playerTwoName) {
        this.player1 = new Player(playerOneName);
        this.player2 = new Player(playerTwoName);
        this.scoreTranslator = new ScoreTranslator();
    }

    public void playerOneScores() {
        player1.scored();
    }

    public void playerTwoScores() {
        player2.scored();
    }

    public String getScore() {
        if ((player2.getScore() >= 4 && player2.getScore() >= player1.getScore() + 2)
                || (player1.getScore() >= 4 && player1.getScore() >= player2.getScore() + 2)) {
            return playerWithHighestScore() + " Wins";
        }

        if ((player2.getScore() >= 4 && player2.getScore() == player1.getScore() + 1)
                || (player1.getScore() >= 4 && player1.getScore() == player2.getScore() + 1)) {
            return "Advantage " + playerWithHighestScore();
        }

        if (player1.getScore() >= 3 && player2.getScore() == player1.getScore()) {
            return "Deuce";
        }

        if(player1.getScore() == player2.getScore()) {
            return scoreTranslator.translate(player1.getScore()) + " all";
        }

        return scoreTranslator.translate(player1.getScore())
                + ","
                + scoreTranslator.translate(player2.getScore());
    }

    private String playerWithHighestScore() {
        if (player1.getScore() > player2.getScore()) {
            return player1.getName();
        } else {
            return player2.getName();
        }
    }
}