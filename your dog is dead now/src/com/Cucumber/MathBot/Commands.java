package com.Cucumber.MathBot;



import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	public String prefix = "~";

	public void onMessageReceived(MessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentStripped().split(" ");
		if (args[0].equalsIgnoreCase(prefix + "help")) {
			event.getMessage().reply("i do nothing yet cry about it").queue();
		}
		String[] args1 = event.getMessage().getContentStripped().split(" ");
		if (args[0].equalsIgnoreCase( "cope")) {
			event.getChannel().sendMessage("amongus").queue();
		}
	}
}
