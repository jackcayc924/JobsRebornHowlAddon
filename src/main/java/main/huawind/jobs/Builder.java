package main.huawind.jobs;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.api.JobsLevelUpEvent;
import com.gamingmesh.jobs.container.Job;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;


public class Builder implements Listener {
	public boolean hasAvaliableSlot(Player player, int howmanyclear) {
		Inventory inv = player.getInventory();
		int check = 0;
		for (ItemStack item : inv.getContents()) {
			if (item == null) {
				check++;
			}
		}
		if (check > howmanyclear) {
			return true;
		}
		return false;
	}


	public static Boolean percentChance(double chance) {
		return Math.random() <= chance;
	}

	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	@EventHandler
	public void builder(JobsLevelUpEvent event) {
		UUID p = event.getPlayer().getUniqueId();
		if (event.getJobName().equals("Builder")) {
			if (event.getLevel() == 10) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.10")) {
					Bukkit.getPlayer(p).giveExp(85); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 10!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 5 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Chance to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Chance to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.10 true";
					Bukkit.dispatchCommand(console, command1);
				}
			}
			if (event.getLevel() == 20) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.20")) {
					Bukkit.getPlayer(p).giveExp(170); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 20!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 10 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.20 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.10";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 30) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.30")) {
					Bukkit.getPlayer(p).giveExp(255); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 30!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 15 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.30 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.20";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 40) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.40")) {
					Bukkit.getPlayer(p).giveExp(370); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 40!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 20 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.40 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.30";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 50) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.50")) {
					Bukkit.getPlayer(p).giveExp(560); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 50!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 25 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.50 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.40";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 60) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.60")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 60!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.60 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.50";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 70) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.70")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 70!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.70 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.60";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 80) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.80")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 80!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.80 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.70";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 90) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.90")) {
					Bukkit.getPlayer(p).giveExp(825); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 90!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 30 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.90 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.80";
					Bukkit.dispatchCommand(console, command2);
				}
			}
			if (event.getLevel() == 100) {
				if (!Bukkit.getPlayer(p).hasPermission("builder.100")) {
					Bukkit.getPlayer(p).giveExp(1895); // 5 10 15 20 25 30 30 30 30 40
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "Congrats " + event.getPlayer().getName() + " on reaching Builder level 100!");
					Bukkit.getPlayer(p).sendMessage(" ");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "Received:");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- 40 Exp Levels");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to refund block on place");
					Bukkit.getPlayer(p).sendMessage(ChatColor.GREEN + "- Increased chances to obtain double the crafted item");
					Bukkit.getPlayer(p).sendMessage(" ");

					String command1 = "lp user " + p + " permission set builder.100 true";
					Bukkit.dispatchCommand(console, command1);
					String command2 = "lp user " + p + " permission unset builder.90";
					Bukkit.dispatchCommand(console, command2);
				}
			}
		}
	}
}


