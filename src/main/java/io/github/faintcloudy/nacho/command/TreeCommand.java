package io.github.faintcloudy.nacho.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class TreeCommand {

    protected TreeCommand() {

    }

    private CommandInformation initialize() {
        if (!this.getClass().isAnnotationPresent(CommandInformation.class))
            throw new NullPointerException("The class wasn't annotated with annotation CommandInformation. Initialized failed!");
        return this.getClass().getAnnotation(CommandInformation.class);
    }


}
