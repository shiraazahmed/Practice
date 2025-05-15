package com.cricket;

public class Class {
    private String playerName;
    private int batting;
    private int bowling;

    public Class(String playerName, int numberB, int numberBowl) {
        this.playerName = playerName;
        this.batting = numberB;
        this.bowling = numberBowl;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getNumberB() {
        return batting;
    }
    public void setNumberB(int numberB) {
        this.batting = numberB;
    }
    public int getNumberBowl() {
        return bowling;
    }
    public void setNumberBowl(int numberBowl) {
        this.bowling = numberBowl;
    }
    @Override
    public String toString() {
        return "Class{" +
                "playerName='" + playerName + '\'' +
                ", numberB=" + batting +
                ", numberBowl=" + bowling +
                '}';
    }
}
