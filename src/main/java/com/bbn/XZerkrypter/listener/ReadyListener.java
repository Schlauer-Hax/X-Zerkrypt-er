package com.bbn.XZerkrypter.listener;

import com.bbn.XZerkrypter.core.GameAnimator;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("Bot started!");
        new GameAnimator(event.getJDA()).start();
    }
}
