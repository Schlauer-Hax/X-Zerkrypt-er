package com.bbn.XZerkrypter.commands.misc;

/*
 * @Author Skidder / GregTCLTK
 */

import com.bbn.XZerkrypter.commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.time.Instant;

public class HelpCommand implements Command {

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(new EmbedBuilder()
                .setTitle("Hilfe")
                .addField("?unmute", "Entmutet einen Benutzer", true)
                .addField("?mute", "Mutet einen Benutzer", true)
                .addField("?unban", "Entbannt einen Benutzer", true)
                .addField("?kick", "Kickt einen Benutzer", true)
                .addField("?ban", "Bannt einen Benutzer", true)
                .addField("?clear 100", "Löscht die angegebene Anzahl von Nachrichten", true)
                .addField("?meme", "Sendet ein zufälliges Meme", true)
                .addField("?selbstzersörung", "Leitet die Selbstzerstörung ein", true)
                .addField("?lotto", "Gibt die die Chance Premium oder Bot Plus zu gewinnen", true)
                .setColor(Color.GREEN)
                .setTimestamp(Instant.now())
                .build()).queue();
    }
}
