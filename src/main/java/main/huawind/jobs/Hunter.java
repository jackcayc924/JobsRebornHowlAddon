package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Hunter implements Listener {
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	
	@EventHandler
	public void hunter(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Hunter")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Hunter Ability");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Shift+RightClick a sword to use!");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.10 true";
					Bukkit.dispatchCommand(console, command1);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased speed level");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased haste level");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased speed level");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased speed level");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased haste level");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased ability duration");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("Hunter.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Hunter level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased speed level");
					Bukkit.getPlayer(p).sendMessage(ChatColor.RED + "- Increased haste level");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set Hunter.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset Hunter.90";
					Bukkit.dispatchCommand(console, command2);
				}
			}
		}
	}
}
