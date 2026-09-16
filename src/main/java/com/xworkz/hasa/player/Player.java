package com.xworkz.hasa.player;

import org.springframework.stereotype.Component;

@Component
public class Player {
    private int playerId;
    private String playerName;

    Player(){
        System.out.println("Player Constructor is Called");
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }
}
