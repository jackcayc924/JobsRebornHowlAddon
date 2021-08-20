package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Woodcutter implements Listener {
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	@EventHandler
	public void woodcutter(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Woodcutter")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Chance to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Chance to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.10 true";
					Bukkit.dispatchCommand(console, command1);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Added Jumpboost");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("woodcutter.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Woodcutter level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to chop down full tree");
					Bukkit.getPlayer(p).sendMessage(ChatColor.YELLOW + "- Increased chances to instantly grow sapling");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set woodcutter.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset woodcutter.90";
					Bukkit.dispatchCommand(console, command2);
				}
			}
		}
	}
}
