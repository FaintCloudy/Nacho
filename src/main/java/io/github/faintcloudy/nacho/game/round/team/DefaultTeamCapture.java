package io.github.faintcloudy.nacho.game.round.team;

import org.bukkit.ChatColor;

public enum DefaultTeamCapture implements TeamCapture {
    RED(ChatColor.RED.toString(), "红"),
    BLUE(ChatColor.BLUE.toString(), "蓝"),
    YELLOW(ChatColor.YELLOW.toString(), "黄"),
    GREEN(ChatColor.GREEN.toString(), "绿"),
    AQUA(ChatColor.AQUA.toString(), "青"),
    WHITE(ChatColor.WHITE.toString(), "白"),
    PURPLE(ChatColor.DARK_PURPLE.toString(), "紫"),
    PINK(ChatColor.LIGHT_PURPLE.toString(), "粉");
    private final String color, display;
    DefaultTeamCapture(String color, String display) {
        this.color = color;
        this.display = display;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String display() {
        return display;
    }
}
