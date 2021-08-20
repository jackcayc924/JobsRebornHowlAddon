package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import main.huawind.NaturesHowl;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Explorer implements Listener {
	int lvl10 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl10");
	int lvl20 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl20");
	int lvl30 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl30");
	int lvl40 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl40");
	int lvl50 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl50");
	int lvl60 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl60");
	int lvl70 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl70");
	int lvl80 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl80");
	int lvl90 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl90");
	int lvl100 = NaturesHowl.getPlugin().getConfig().getInt("Explorer.cooldown.lvl100");
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	@EventHandler
	public void explorer(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Explorer")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Exploro Ability /exploro");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Teleport some blocks ahead with debuffs");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl10 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.10 true";
					String command2 = "lp user " + p + " permission set explorer.exploro true";
					Bukkit.dispatchCommand(console, command1);
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl20 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl30 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl40 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Added Jumpboost");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl50 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl60 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl70 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl80 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl90 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("explorer.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Explorer level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased teleport distance");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Cooldown reduced");
					Bukkit.getPlayer(p).sendMessage(ChatColor.DARK_GREEN + "- Ability Cooldown: " + lvl100 + " seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set explorer.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset explorer.90";
					Bukkit.dispatchCommand(console, command2);
				}
			}
		}
	}
}

