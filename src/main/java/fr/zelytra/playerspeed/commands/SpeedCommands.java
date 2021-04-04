package fr.zelytra.playerspeed.commands;

import fr.zelytra.playerspeed.PlayerSpeed;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        float speed;
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 0 || !isNumeric(args[0])) {
                player.sendMessage(PlayerSpeed.getPlayerPrefix() + "§cWrong argument please enter a number.");
                return false;
            } else if (args.length != 0 && Float.valueOf(args[0]) > 0 && Float.valueOf(args[0]) <= 10) {
                speed = (Float.valueOf(args[0])) / 10;
                player.setFlySpeed(speed);
                player.sendMessage(PlayerSpeed.getPlayerPrefix() + "§6Fly speed set to §a" + Float.valueOf(args[0]) + "§6 !");
                return true;
            } else {
                player.sendMessage(PlayerSpeed.getPlayerPrefix() + "§cPlease enter a number between 1 and 10.");
                return false;
            }

        }
        return false;
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
