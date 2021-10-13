package io.github.faintcloudy.nacho.settings.game;

import io.github.faintcloudy.nacho.settings.Set;
import io.github.faintcloudy.nacho.settings.Settings;

public class GameSettings extends Settings {
    @Set(key = "team-settings")
    public TeamSettings teamSettings;

    @Set(key = "setup-settings")
    public SetupSettings setupSettings;

    @Set(key = "start-settings")
    public StartSettings startSettings;

    /**
     * Usually, there are start and end (a round) in a round game.
     * Such as Bedwars, Skywars, MegaWalls and so on.
     *
     * Non-round game can be played at any time.
     * Like The Pit, BattleWars, FFA.
     *
     * So if you disable the round game, the start will be disabled too automatically.
     */
    @Set(key = "round-game")
    public boolean roundGame;

    public GameSettings(TeamSettings teamSettings, SetupSettings setupSettings,
                        StartSettings startSettings, boolean roundGame) {
        this.teamSettings = teamSettings;
        this.setupSettings = setupSettings;
        this.startSettings = startSettings;
        this.roundGame = roundGame;
    }

}
