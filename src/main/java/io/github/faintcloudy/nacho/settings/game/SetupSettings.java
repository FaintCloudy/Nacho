package io.github.faintcloudy.nacho.settings.game;

import io.github.faintcloudy.nacho.settings.Set;
import io.github.faintcloudy.nacho.settings.Settings;
import org.bukkit.Location;

import java.util.List;

public class SetupSettings extends Settings {
    @Set(key = "lobby-location")
    public Location lobbyLocation;

    /**
     * If the amount of team spawn locations is one
     * and the game is a non-round game, it will be
     * the spawn location of non-round game.
     */

    @Set(key = "team-spawn-locations")
    public List<Location> teamSpawnLocations;

    public SetupSettings(Location lobbyLocation, List<Location> teamSpawnLocations) {
        this.lobbyLocation = lobbyLocation;
        this.teamSpawnLocations = teamSpawnLocations;
    }
}
