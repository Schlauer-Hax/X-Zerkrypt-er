package com.bbn.XZerkrypter.commands.fun;

/*
 * @Author Skidder / GregTCLTK
 */

import com.bbn.XZerkrypter.commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.PrivateChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.time.Instant;

import static com.bbn.XZerkrypter.XZerkrypter.BotPlus;

public class UserKickCommand implements Command {

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (BotPlus.contains(event.getAuthor().getId())) {
            if (event.getMessage().getMentionedMembers().size() == 1) {
                PrivateChannel channel = event.getMessage().getMentionedMembers().get(0).getUser().openPrivateChannel().complete();
                channel.sendMessage(new EmbedBuilder()
                        .setTitle("Du wurdest gekickt")
                        .setDescription("Du wurdest vom " + event.getGuild().getName() + " Server gekickt.")
                        .setTimestamp(Instant.now())
                        .setColor(Color.RED)
                        .build()).queue();

                event.getTextChannel().sendMessage(new EmbedBuilder()
                        .setTitle("Nachricht gesendet")
                        .setDescription("Ich habe erfolgreich " + event.getMessage().getMentionedMembers().get(0).getUser().getName() + " \"gekickt\".")
                        .setColor(Color.GREEN)
                        .setTimestamp(Instant.now())
                        .build()).queue();
            }
        } else {
            event.getTextChannel().sendMessage(new EmbedBuilder()
                    .setTitle("Kein Bot Plus")
                    .setDescription("Du benötigst den Bot Plus Status um diesen Command zu nutzen!")
                    .setColor(Color.RED)
                    .setTimestamp(Instant.now())
                    .build()).queue();
        }
    }
}
