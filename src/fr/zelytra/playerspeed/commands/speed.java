package fr.zelytra.playerspeed.commands;

import org.bukkit.command.Command;
import fr.zelytra.playerspeed.commands.function;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class speed implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg) {
		float speed;
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if ( arg.length == 0 || !function.isNumeric(arg[0]) ) {
				player.sendMessage(function.prefix() + "§cWrong argument please enter a number.");
				return false;
			}
			else if (arg.length != 0 && Float.valueOf(arg[0]) > 0 && Float.valueOf(arg[0]) <= 10) {
				speed = (Float.valueOf(arg[0])) / 10;
				player.setFlySpeed(speed);
				// System.out.println(speed);
				player.sendMessage(function.prefix() + "§6Fly speed set to §a" + Float.valueOf(arg[0]) + "§6 !");
				return true;
			} else {
				player.sendMessage(function.prefix() + "§cPlease unter a number between 1 and 10.");
				return false;//
			}

		}
		return false;
	}

}
