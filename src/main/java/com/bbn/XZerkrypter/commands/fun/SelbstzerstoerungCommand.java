package com.bbn.XZerkrypter.commands.fun;

/*
 * @Author Skidder / GregTCLTK
 */

import com.bbn.XZerkrypter.commands.Command;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class SelbstzerstoerungCommand implements Command {

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        boolean random = Math.random() < 0.50;
        if (random) {
            Message msg = event.getTextChannel().sendMessage("Leite Selbstzerstörung ein in 5... :bomb:").complete();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 4... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 3... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 2... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 1... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom:").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm,").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm, das hat irgendwie nicht so geklappt,").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm, das hat irgendwie nicht so geklappt, ich bin noch da...").queue();
        } else {
            Message msg = event.getTextChannel().sendMessage("Leite Selbstzerstörung ein in 5... :bomb:").complete();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 4... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 3... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 2... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("Leite Selbstzerstörung ein in 1... :bomb:").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom:").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm,").queue();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm, im Kino").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm, im Kino kam das irgendwie cooler rüber... ").queue();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            msg.editMessage("BOOOOOM!!! :boom::boom::boom: \n\n Hmmmm, im Kino kam das irgendwie cooler rüber... https://tenor.com/uDdW.gif").queue();
        }
    }
}
