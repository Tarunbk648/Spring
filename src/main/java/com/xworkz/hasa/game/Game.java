package com.xworkz.hasa.game;

import com.xworkz.hasa.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {
    private int gameId;
    @Autowired
    private Player player;

    Game(){
        System.out.println("Game for Playing");
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGameId() {
        return gameId;
    }

    public Player getPlayer() {
        return player;
    }
}
