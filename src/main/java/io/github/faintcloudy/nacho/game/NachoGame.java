package io.github.faintcloudy.nacho.game;

import io.github.faintcloudy.nacho.settings.game.GameSettings;

public class NachoGame {
    private GameSettings gameSettings;
    public NachoGame(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }
}
