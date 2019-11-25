package com.bbn.XZerkrypter;

import com.bbn.XZerkrypter.listener.ReadyListener;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class XZerkrypter {

    public static void main(String[] Args) {

        JDABuilder builder = new JDABuilder();
        builder.setToken("NjQ4NTQyODk2MjY5ODE5OTA2.Xdv0OQ.RVehDymEQoGvJdGJcrfaDqIonbQ");
        builder.addEventListeners(new ReadyListener());
        builder.setAutoReconnect(true);
        try {
            builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
