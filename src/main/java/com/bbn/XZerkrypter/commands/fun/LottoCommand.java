package com.bbn.XZerkrypter.commands.fun;

/*
 * @Author Skidder / GregTCLTK
 */

import com.bbn.XZerkrypter.commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.time.Instant;

import static com.bbn.XZerkrypter.XZerkrypter.BotPlus;

public class LottoCommand implements Command {

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        boolean premium = Math.random() < 0.07;
        boolean botplus = Math.random() < 0.30;
        if (premium) {
            if (event.getGuild().getSelfMember().hasPermission(Permission.MANAGE_ROLES)) {
                        event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRoleById("648424818441715723")).reason("Im Lotto gewonnen").queue();
                        event.getTextChannel().sendMessage(new EmbedBuilder()
                                .setTitle("Gewonnen!")
                                .setDescription("Herzlichen Glückwunsch du hast soeben die Premium Rolle gewonnen!")
                                .setColor(Color.magenta)
                                .setTimestamp(Instant.now())
                                .build()).queue();
            } else {
                event.getTextChannel().sendMessage(new EmbedBuilder()
                        .setTitle("Keine Permission")
                        .setDescription("Ich benötige die `Manage Roles` Permission um diesen Command auszuführen.")
                        .setColor(Color.RED)
                        .setTimestamp(Instant.now())
                        .build()).queue();
            }
        } else if (botplus) {
                BotPlus.add(event.getAuthor().getId());
                event.getTextChannel().sendMessage(new EmbedBuilder()
                        .setTitle("Gewonnen!")
                        .setDescription("Herzlichen Glückwunsch du hast soeben den Bot Plus Status gewonnen!")
                        .setColor(Color.magenta)
                        .setTimestamp(Instant.now())
                        .build()).queue();
        } else {
            event.getTextChannel().sendMessage(new EmbedBuilder()
                    .setTitle("Leider nichts")
                    .setDescription("Das war wohl leider nichts. Vielleicht nächstes mal.")
                    .setColor(Color.CYAN)
                    .setTimestamp(Instant.now())
                    .build()).queue();
        }
    }
}
