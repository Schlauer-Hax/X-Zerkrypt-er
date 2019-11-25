package com.bbn.XZerkrypter;

import com.bbn.XZerkrypter.commands.moderation.*;
import com.bbn.XZerkrypter.core.CommandHandler;
import com.bbn.XZerkrypter.listener.CommandListener;
import com.bbn.XZerkrypter.listener.ReadyListener;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class XZerkrypter {

    public static void main(String[] Args) {

        JDABuilder builder = new JDABuilder();
        builder.setToken("NjQ4NTQyODk2MjY5ODE5OTA2.Xdv0OQ.RVehDymEQoGvJdGJcrfaDqIonbQ");
        builder.addEventListeners(new ReadyListener(), new CommandListener());
        builder.setAutoReconnect(true);

        CommandHandler.commands.put("ban", new BanCommand());
        CommandHandler.commands.put("kick", new KickCommand());
        CommandHandler.commands.put("clear", new ClearCommand());
        CommandHandler.commands.put("unban", new UnbanCommand());
        CommandHandler.commands.put("mute", new MuteCommand());
        CommandHandler.commands.put("unmute", new UnmuteCommand());
        try {
            builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
