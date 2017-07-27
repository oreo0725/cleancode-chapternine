package com.cleancode.chapternine;

public class Application {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame("Howard", "Zen");

        tennisGame.playerOneScores(); //15
        tennisGame.playerTwoScores(); //15
        System.out.println(tennisGame.getScore());

        tennisGame.playerOneScores(); //30
        System.out.println(tennisGame.getScore());

        tennisGame.playerTwoScores(); //30
        tennisGame.playerOneScores(); //40
        tennisGame.playerTwoScores(); //40
        System.out.println(tennisGame.getScore());

        tennisGame.playerOneScores(); // Howard Advantage
        System.out.println(tennisGame.getScore());

        tennisGame.playerTwoScores(); // Deuce
        tennisGame.playerTwoScores(); // Zen Advantage
        System.out.println(tennisGame.getScore());
        
        tennisGame.playerTwoScores(); // Zen Wins
        System.out.println(tennisGame.getScore());
    }
}
