package me.koply.kcommando;

import me.koply.kcommando.integration.Integration;

import java.util.ArrayList;
import java.util.List;

public class KCommando {

    public final Integration integration;
    public KCommando(Integration integration) {
        this.integration = integration;
    }

    private final List<String> packagePaths = new ArrayList<>();
    private String prefix;
    private long cooldown;
    private boolean useCaseSensitivity;
    private boolean readBotMessages;
    public static boolean verbose = false;

    public KCommando build() {
        KInitializer initializer = new KInitializer(this);
        initializer.build();
        return this;
    }

    public void registerCommand(Object customInstance) {

    }

    public List<String> getPackagePaths() {
        return packagePaths;
    }

    public KCommando addPackagePath(String path) {
        packagePaths.add(path);
        return this;
    }

    public String getPrefix() {
        return prefix;
    }

    public KCommando setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public long getCooldown() {
        return cooldown;
    }

    public KCommando setCooldown(long cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    public boolean isUseCaseSensitivity() {
        return useCaseSensitivity;
    }

    public KCommando setUseCaseSensitivity(boolean useCaseSensitivity) {
        this.useCaseSensitivity = useCaseSensitivity;
        return this;
    }

    public boolean isReadBotMessages() {
        return readBotMessages;
    }

    public KCommando setReadBotMessages(boolean readBotMessages) {
        this.readBotMessages = readBotMessages;
        return this;
    }

    public KCommando setVerbose(boolean verbose) {
        KCommando.verbose = verbose;
        return this;
    }
}