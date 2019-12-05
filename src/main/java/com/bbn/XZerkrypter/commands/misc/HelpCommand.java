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
                .addField("?unmute @Skidder#6775", "Entmutet einen Benutzer", true)
                .addField("?mute @Skidder#6775", "Mutet einen Benutzer", true)
                .addField("?unban Skidder", "Entbannt einen Benutzer", true)
                .addField("?kick @Skidder#6775", "Kickt einen Benutzer", true)
                .addField("?ban @Skidder#6775", "Bannt einen Benutzer", true)
                .addField("?clear 100", "Löscht die angegebene Anzahl von Nachrichten", true)
                .addField("?meme", "Sendet ein zufälliges Meme", true)
                .addField("?selbstzersörung", "Leitet die Selbstzerstörung ein", true)
                .addField("?lotto", "Gibt die die Chance Premium oder Bot Plus zu gewinnen", true)
                .setColor(Color.GREEN)
                .setTimestamp(Instant.now())
                .build()).queue();
    }
}
