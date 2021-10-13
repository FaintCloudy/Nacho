package io.github.faintcloudy.nacho;

import io.github.faintcloudy.nacho.settings.chat.ChatSettings;
import io.github.faintcloudy.nacho.settings.game.GameSettings;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class GameFactory {
    private static final List<Nacho> instances = new ArrayList<>();
    public static Nacho newInstance(GameSettings gameSettings, ChatSettings chatSettings, JavaPlugin plugin) {
        Nacho nacho = new Nacho(gameSettings, chatSettings, plugin);
        instances.add(nacho);
        return nacho;
    }

    public static Nacho getInstance(int id) {
        for (Nacho instance : instances) {
            if (instance.getId() == id)
                return instance;
        }

        return null;
    }

    public static List<Nacho> getInstances() {
        return instances;
    }

    public static Nacho getInstance() {
        if (instances.size() > 0) return instances.get(0);
        else return null;
    }
}
