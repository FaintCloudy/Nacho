package io.github.faintcloudy.nacho;

import io.github.faintcloudy.nacho.game.NachoGame;
import io.github.faintcloudy.nacho.settings.chat.ChatSettings;
import io.github.faintcloudy.nacho.settings.game.GameSettings;
import org.bukkit.plugin.java.JavaPlugin;

public class Nacho {
    private final int id = this.hashCode();
    private final JavaPlugin plugin;
    private ChatSettings chatSettings;
    private NachoGame game;
    protected Nacho(GameSettings gameSettings, ChatSettings chatSettings, JavaPlugin plugin) {
        this.game = new NachoGame(gameSettings);
        this.chatSettings = chatSettings;
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public ChatSettings getChatSettings() {
        return chatSettings;
    }

    public void setChatSettings(ChatSettings chatSettings) {
        this.chatSettings = chatSettings;
    }

    public NachoGame getGame() {
        return game;
    }

    public void setGame(NachoGame game) {
        this.game = game;
    }

    public int getId() {
        return id;
    }

}
