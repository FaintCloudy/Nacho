package io.github.faintcloudy.nacho.settings.game;

import io.github.faintcloudy.nacho.settings.Set;
import io.github.faintcloudy.nacho.settings.Settings;

public class StartSettings extends Settings {
    // The start time is in seconds.
    @Set(key = "start-time")
    public int startTime;

    // Min players amount means when the game start to time.
    @Set(key = "min-players-amount")
    public int minPlayersAmount;

    // When a start time of stamp is up, players will be told the current start time (by titles and messages usually).
    @Set(key = "time-stamps")
    public int[] timeStamps;

    /**
     * When the players amount is more than or equals ample players amount,
     * the game will be sped.
     */
    @Set(key = "ample-players-amount")
    public int amplePlayersAmount;

    /**
     * When the ample players amount is up, the start time will be sped to
     * the sped start time.
     */
    @Set(key = "sped-start-time")
    public int spedStartTime;

    public StartSettings(int startTime, int minPlayersAmount, int[] timeStamps, int amplePlayersAmount, int spedStartTime) {
        this.startTime = startTime;
        this.minPlayersAmount = minPlayersAmount;
        this.timeStamps = timeStamps;
        this.amplePlayersAmount = amplePlayersAmount;
        this.spedStartTime = spedStartTime;
    }
}
