package main.huawind;

import com.gamingmesh.jobs.Jobs;
import main.huawind.Abilities.*;
import main.huawind.TabComplete.NHCONFGITAB;
import main.huawind.TabComplete.NHDEBUGTAB;
import main.huawind.commands.*;
import main.huawind.ingameConfig.*;
import main.huawind.jobs.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class NaturesHowl extends JavaPlugin {

	boolean nightcheck = false;

	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public static void setPlugin(Plugin plugin) {
		NaturesHowl.plugin = plugin;
	}

	public static Boolean percentChance(double chance) {
		return Math.random() <= chance;
	}

	public boolean night(Player p) {
		p.getWorld().getTime();
		long time = p.getWorld().getTime();
		return time > 18000 && time < 23000;
	}

	public boolean day(Player p) {
		return !night(p);
	}

	configData config = new configData();

	@Override
	public void onEnable() {
		plugin = this;
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GREEN + "NaturesHowl" + ChatColor.GREEN + "]" + ChatColor.DARK_GREEN + " Successfully loaded! v1.1");
		getServer().getPluginManager().registerEvents(new Farmer(), this);
		getServer().getPluginManager().registerEvents(new Fisherman(), this);
		getServer().getPluginManager().registerEvents(new Explorer(), this);
		getServer().getPluginManager().registerEvents(new Builder(), this);
		getServer().getPluginManager().registerEvents(new Woodcutter(), this);
		getServer().getPluginManager().registerEvents(new Hunter(), this);
		getServer().getPluginManager().registerEvents(new Miner(), this);
		getServer().getPluginManager().registerEvents(new FarmerAbility(), this);
		getServer().getPluginManager().registerEvents(new FishermanAbility(), this);
		getServer().getPluginManager().registerEvents(new ExplorerAbility(), this);
		getServer().getPluginManager().registerEvents(new BuilderAbility(), this);
		getServer().getPluginManager().registerEvents(new WoodcutterAbility(), this);
		getServer().getPluginManager().registerEvents(new HunterAbility(), this);
		getServer().getPluginManager().registerEvents(new MinerAbility(), this);
		getServer().getPluginManager().registerEvents(new BuilderConfig(), this);
		getServer().getPluginManager().registerEvents(new ExplorerConfig(), this);
		getServer().getPluginManager().registerEvents(new FarmerConfig(), this);
		getServer().getPluginManager().registerEvents(new FishermanConfig(), this);
		getServer().getPluginManager().registerEvents(new HunterConfig(), this);
		getServer().getPluginManager().registerEvents(new MinerConfig(), this);
		getServer().getPluginManager().registerEvents(new WoodcutterConfig(), this);

		this.getCommand("exploro").setExecutor(new exploroCommand());
		this.getCommand("natureshowl").setExecutor(new natureshowlreload());
		this.getCommand("NHdebug").setExecutor(new NHdebug());
		this.getCommand("NHconfig").setExecutor(new NHconfig());
		this.getCommand("veinminer").setExecutor(new veinminer());

		this.getCommand("NHdebug").setTabCompleter(new NHDEBUGTAB());
		this.getCommand("Nhconfig").setTabCompleter(new NHCONFGITAB());

		NaturesHowl.getPlugin().saveDefaultConfig();

		config.loadConfig();

		if(!exploroCommand.exploroHashMap.isEmpty()) {
			exploroCommand.loadHashMap();
		}

		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GREEN + "NaturesHowl" + ChatColor.GREEN + "]" + ChatColor.DARK_GREEN + " Config loaded");


		BukkitScheduler scheduler = getServer().getScheduler();
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
					for (Player p : Bukkit.getOnlinePlayers()) {
						if (night(p)) {
							if (Jobs.getPlayerManager().getJobsPlayer(p).isInJob(Jobs.getJob("Fisherman")) && Jobs.getPlayerManager().getJobsPlayer(p).getJobProgression(Jobs.getJob("Fisherman")).getLevel() >= 50 && !nightcheck) {
								p.sendMessage(" ");
								p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "The water calls your name...");
								p.sendMessage(" ");
								nightcheck = true;
							}
						}
						if (day(p)) {
							nightcheck = false;
						}
					}
			}
		}, 0L, 20L);
		// Plugin startup logic

	}



	@Override
	public void onDisable() {
		exploroCommand.saveHashMap();
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GREEN + "NaturesHowl" + ChatColor.GREEN + "]" + ChatColor.DARK_RED + " Disabled! We out!");
	}

}


