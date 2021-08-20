package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Farmer implements Listener {
	int lvl10 = 60;
	int lvl20 = 50;
	int lvl30 = 40;
	int lvl40 = 30;
	int lvl50 = 20;
	int lvl60 = 15;
	int lvl70 = 10;
	int lvl80 = 5;
	int lvl90 = 2;
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	@EventHandler
	public void farmer(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Farmer")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl10 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.10 true";
					Bukkit.dispatchCommand(console, command1);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl20 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl30 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl40 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl50 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl60 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl70 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl80 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: " + lvl90 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("farmer.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Farmer level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Better chance to get more crops from harvesting");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Sneaking over crops instantly grows them");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "- Ability Cooldown: None");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set farmer.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset farmer.90";
					Bukkit.dispatchCommand(console, command2);

				}
			}
		}
	}
}
