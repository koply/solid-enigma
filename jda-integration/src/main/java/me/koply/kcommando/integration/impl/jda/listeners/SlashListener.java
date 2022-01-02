package me.koply.kcommando.integration.impl.jda.listeners;

import me.koply.kcommando.handler.SlashCommandHandler;
import me.koply.kcommando.internal.AsyncCaller;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class SlashListener extends ListenerAdapter implements AsyncCaller {

    private final SlashCommandHandler handler;
    public SlashListener(SlashCommandHandler handler) {
        this.handler = handler;
    }

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        // TODO handle
    }
}