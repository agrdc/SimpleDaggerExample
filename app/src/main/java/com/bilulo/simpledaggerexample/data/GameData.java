package com.bilulo.simpledaggerexample.data;

import javax.inject.Inject;

public class GameData {

    private int playerID;
    private double score;
    private String playerName;


    public GameData(int playerID, double score, String playerName) {
        this.playerID = playerID;
        this.score = score;
        this.playerName = playerName;
    }

    @Inject
    public GameData() {
        this.playerName = "Bilulo Player 3000 - testing dependency injection";
        this.score = 42000;
        this.playerID = 1384928;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
