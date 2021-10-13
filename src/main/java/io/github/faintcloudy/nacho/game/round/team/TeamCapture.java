package io.github.faintcloudy.nacho.game.round.team;

public interface TeamCapture {

    default boolean equals(TeamCapture capture) {
        return this == capture;
    }

    String color();
    String display();

}
