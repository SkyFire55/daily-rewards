package ru.skyfire.zeta.dailyrewards.commands;

import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;

public class CmdDaily implements CommandExecutor{
    @Override
    public CommandResult execute(CommandSource sender, CommandContext args) {
        return CommandResult.success();
    }
}
