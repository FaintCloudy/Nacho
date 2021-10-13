package io.github.faintcloudy.example;

import io.github.faintcloudy.nacho.GameFactory;
import io.github.faintcloudy.nacho.Nacho;
import io.github.faintcloudy.nacho.settings.chat.MessageSettings;
import io.github.faintcloudy.nacho.settings.chat.SidebarSettings;
import io.github.faintcloudy.nacho.settings.game.GameSettings;
import io.github.faintcloudy.nacho.settings.game.SetupSettings;
import io.github.faintcloudy.nacho.settings.game.StartSettings;
import io.github.faintcloudy.nacho.settings.game.TeamSettings;
import org.bukkit.Location;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Example extends JavaPlugin {
    Nacho nacho;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
        //TODO GameSettings and ChatSettings.
        //TODO this.nacho = GameFactory.newInstance(gameSettings, chatSettings, true);
    }

    public SetupSettings getSetupSettings() {
        ConfigurationSection config = this.getConfig().getConfigurationSection("setup");
        return new SetupSettings((Location) config.get("lobby"), (List<Location>) config.getList("team-spawn-locations"));
    }

    public StartSettings getStartSettings() {
        ConfigurationSection config = this.getConfig().getConfigurationSection("start");
        return new StartSettings(config.getInt("start-time"), config.getInt("min-players-amount"),
                (int[]) config.get("time-stamps"), config.getInt("ample-players-amount"),
                config.getInt("sped-start-time"));
    }
    
    public TeamSettings getTeamSettings() {
        ConfigurationSection config = this.getConfig().getConfigurationSection("team");
        return new TeamSettings(config.getInt("team-amount"), config.getInt("team-players"));
    }
    
    public MessageSettings getMessageSettings() {
        ConfigurationSection config = this.getConfig().getConfigurationSection("chat.messages");
        return (MessageSettings) new MessageSettings().set("game-started", config.getString("game-started"))
                .set("join-game", config.getString("join-game")).set("on-time-stamp", config.getString("on-time-stamp"))
                .set("bed-broken", config.getString("bed-broken")).set("team-eliminated", config.getString("team-eliminated"))
                .set("game-ended", config.getString("game-ended"));
    }

    public SidebarSettings getSidebarSettings() {
        ConfigurationSection config = this.getConfig().getConfigurationSection("chat.sidebar");
        return new SidebarSettings(config.getStringList("lobby"), config.getStringList("in-game"));
    }

    //TODO team settings, message settings, sidebar settings.
}
