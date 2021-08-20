package main.huawind.jobs;

import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class Fisherman implements Listener {

	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	//BEGIN Fisherman
	@EventHandler
	public void fisherman(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Fisherman")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Chance to get custom drops from fishing");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.10 true";
					Bukkit.dispatchCommand(console, command1);

				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Diamond added to custom drops");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Emerald added to custom drops");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Midnight fishing event");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Catching a fish time reduced by 2 seconds");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("fisherman.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Fisherman level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- Custom drops amount increased");
					Bukkit.getPlayer(p).sendMessage(ChatColor.AQUA + "- No catch time for fish");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set fisherman.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset fisherman.90";
					Bukkit.dispatchCommand(console, command2);

				}
			}
		}
	}
	// END FISHERMAN
}


