package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Miner implements Listener {
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	@EventHandler
	public void miner(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Miner")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Miner Ability");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.10 true";
					Bukkit.dispatchCommand(console, command1);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Ability to veinmine blocks");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("Miner.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Miner level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability radius");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_AQUA + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Miner.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Miner.90";
					Bukkit.dispatchCommand(console, command2);
				}
			}
		}
	}
}
