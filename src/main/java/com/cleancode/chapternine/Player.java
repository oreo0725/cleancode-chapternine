package com.cleancode.chapternine;

public class Player {
    private String name;
    private int score;
    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public void scored() {
        ++score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
