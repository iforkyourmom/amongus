package com.Cucumber.MathBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class MathBotmain {
	public static JDA jda;
	
	//Main method
	public static void main(String[] args) throws LoginException {
		JDA jda = JDABuilder.createDefault("OTQ5NDY2MTE4NTk3Mjc5Nzg0.YiKxOg.HXpJxAwx5xukhewfOFIstN14iJc").build();
	jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
	jda.getPresence().setPresence(Activity.listening("~help"),true);
	jda.addEventListener(new Commands());
	
	}
	
}
