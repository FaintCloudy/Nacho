package io.github.faintcloudy.nacho.settings.chat;

import io.github.faintcloudy.nacho.settings.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SidebarSettings {
    @Set(key = "in-game-sidebar")
    private List<String> ingameSidebar = new ArrayList<>();
    @Set(key = "lobby-sidebar")
    private List<String> lobbySidebar;
    public SidebarSettings(List<String> ingameSidebar) {
        this.ingameSidebar = ingameSidebar;
    }

    public SidebarSettings(List<String> ingameSidebar, List<String> lobbySidebar) {
        this.ingameSidebar = ingameSidebar;
        this.lobbySidebar = lobbySidebar;
    }

    public List<String> getIngameSidebar() {
        return ingameSidebar;
    }

    public List<String> getLobbySidebar() {
        return lobbySidebar;
    }
}
