package fr.zelytra.playerspeed.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] arg3) {
		
		if(sender instanceof Player) {
			Player player =(Player)sender;
			player.sendMessage("Pong");
			return true;
		}
		
		
		
		
		
		
		return false;
	}

}
