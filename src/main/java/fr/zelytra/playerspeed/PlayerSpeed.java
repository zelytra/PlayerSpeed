package fr.zelytra.playerspeed;

import fr.zelytra.playerspeed.commands.NightVisionCommands;
import fr.zelytra.playerspeed.commands.SpeedCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerSpeed extends JavaPlugin {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void onEnable() {
        System.out.println("");
        System.out.println(ANSI_GREEN + "PlayerSpeed" + ANSI_RESET + " is UP !");
        System.out.println("");
        regCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void regCommands() {
        getCommand("speed").setExecutor(new SpeedCommands());
        getCommand("nightvision").setExecutor(new NightVisionCommands());
    }

    public static String getPlayerPrefix() {
        return new String("§3[§bPlayerSpeed§3]§r ");
    }
}
