package com.bbn.XZerkrypter;

import com.bbn.XZerkrypter.commands.fun.*;
import com.bbn.XZerkrypter.commands.misc.*;
import com.bbn.XZerkrypter.commands.moderation.*;
import com.bbn.XZerkrypter.core.*;
import com.bbn.XZerkrypter.listener.*;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;

public class XZerkrypter {

    public static ArrayList BotPlus = new ArrayList();
    public static void main(String[] Args) {

        JDABuilder builder = new JDABuilder();
        builder.setToken(SECRETS.Token);
        builder.addEventListeners(new ReadyListener(), new CommandListener());
        builder.setAutoReconnect(true);

        CommandHandler.commands.put("ban", new BanCommand());
        CommandHandler.commands.put("kick", new KickCommand());
        CommandHandler.commands.put("clear", new ClearCommand());
        CommandHandler.commands.put("unban", new UnbanCommand());
        CommandHandler.commands.put("mute", new MuteCommand());
        CommandHandler.commands.put("unmute", new UnmuteCommand());
        CommandHandler.commands.put("meme", new MemeCommand());
        CommandHandler.commands.put("lotto", new LottoCommand());
        CommandHandler.commands.put("userban", new UserBanCommand());
        CommandHandler.commands.put("userkick", new UserKickCommand());
        CommandHandler.commands.put("help", new HelpCommand());
        CommandHandler.commands.put("selbstzerstörung", new SelbstzerstoerungCommand());
        try {
            builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
