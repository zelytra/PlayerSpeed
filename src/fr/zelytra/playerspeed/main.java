package fr.zelytra.playerspeed;

import org.bukkit.plugin.java.JavaPlugin;

import fr.zelytra.playerspeed.commands.ping;
import fr.zelytra.playerspeed.commands.speed;

public class main extends JavaPlugin {
	// Color consol
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
//test commit
	public void onEnable() {
		System.out.println("");
		System.out.println(ANSI_GREEN + "PlayerSpeed 1.0" + ANSI_RESET + " - Running on Spighot");
		System.out.println(ANSI_GREEN + "PlayerSpeed" + ANSI_RESET + " is UP !");
		System.out.println("");
		getCommand("ping").setExecutor(new ping());
		getCommand("speed").setExecutor(new speed());
	}

	@Override
	public void onDisable() {
		System.out.println("Plugin off");
	}

}
