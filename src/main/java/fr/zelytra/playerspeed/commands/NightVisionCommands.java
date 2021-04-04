package fr.zelytra.playerspeed.commands;

import fr.zelytra.playerspeed.PlayerSpeed;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                player.sendMessage(PlayerSpeed.getPlayerPrefix() + "§aNight Vision effect has been removed.");
                return true;
            }
            PotionEffect nv = new PotionEffect(PotionEffectType.NIGHT_VISION, 99999999, 2, false, false, false);
            player.addPotionEffect(nv);
            player.sendMessage(PlayerSpeed.getPlayerPrefix() + "§aNight Vision effect has been set.");
            return true;
        }
        return false;
    }
}
