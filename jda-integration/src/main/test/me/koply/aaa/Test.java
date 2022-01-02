package me.koply.aaa;

import me.koply.kcommando.KCommando;
import me.koply.kcommando.integration.impl.jda.JDAIntegration;
import me.koply.kcommando.internal.annotations.Commando;
import me.koply.kcommando.internal.annotations.HandleButton;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Emoji;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.Button;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Test extends ListenerAdapter {

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault("token")
                .disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE)
                .setBulkDeleteSplittingEnabled(false)
                .setActivity(Activity.watching("Ğ"))
                .build();
        jda.awaitReady();

        Test app = new Test();
        jda.addEventListener(app);

        KCommando kcm = new KCommando(new JDAIntegration(jda))
                .addPackagePath(Test.class.getPackage().getName())
                .setVerbose(true)
                .setPrefix(".")
                .setCooldown(2000)
                .build();

    }

    @HandleButton("testButton")
    public static void button(ButtonClickEvent e) {
        System.out.println("testButton from kekomandoo");
    }

    @HandleButton("zink")
    public static void zink(ButtonClickEvent e) {
        System.out.println("zink from kekomandooo");
    }

    @Commando(name = "test", aliases = "test")
    public static void gommand(MessageReceivedEvent e) {
        e.getChannel().sendMessage("bişeyler yapmışsın knk").queue();
    }

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        System.out.println("slash command timez " + event.getName() + " - " + event.getCommandId());
        System.out.println(event.getOptions());

        System.out.println(event.getCommandString());
        event.reply("ponk")
                .addActionRow(Button.success("testButton", Emoji.fromUnicode("🥴")),
                        Button.primary("zink", "label"))
                .queue();

    }
}
