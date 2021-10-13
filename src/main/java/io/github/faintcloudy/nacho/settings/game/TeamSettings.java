package io.github.faintcloudy.nacho.settings.game;

import io.github.faintcloudy.nacho.game.round.team.DefaultTeamCapture;
import io.github.faintcloudy.nacho.game.round.team.TeamCapture;
import io.github.faintcloudy.nacho.settings.Set;
import io.github.faintcloudy.nacho.settings.Settings;

public class TeamSettings extends Settings {
    // When the team amount is less than or equals 1, it means that the team is disabled.
    @Set(key = "team-amount")
    public int teamAmount;

    // The number of players per team
    @Set(key = "team-players")
    public int teamPlayers;

    // Default team captures are the values of enum io.github.faintcloudy.game.team.DefaultTeamCapture
    @Set(key = "team-captures")
    public TeamCapture[] teamCaptures;

    public TeamSettings(int teamAmount, int teamPlayers, TeamCapture[] teamCaptures) {
        this.teamAmount = teamAmount;
        this.teamPlayers = teamPlayers;
        this.teamCaptures = teamCaptures;
    }

    public TeamSettings(int teamAmount, int teamPlayers) {
        this(teamAmount, teamPlayers, DefaultTeamCapture.values());
    }

    public TeamSettings() {
        this(1, 4);
    }
}
