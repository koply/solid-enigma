package me.koply.kcommando.handler;

import me.koply.kcommando.internal.boxes.SlashBox;

import java.util.Map;

public class SlashCommandHandler {

    private final Map<String, SlashBox> commands;
    public SlashCommandHandler(Map<String, SlashBox> commands) {
        this.commands = commands;
    }

    



}