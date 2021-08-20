package main.huawind.commands;

import main.huawind.NaturesHowl;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

// This is to reload config of natureshowl
public class natureshowlreload implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		if (label.equalsIgnoreCase("natureshowl")) {
			if (sender.hasPermission("natureshowl.reload")) {
				if (args.length >= 1) {
					if (args[0].equalsIgnoreCase("reload")) {

						sender.sendMessage(ChatColor.GREEN + "Nature's Howl reloaded!");
						NaturesHowl.getPlugin().saveDefaultConfig();
						NaturesHowl.getPlugin().reloadConfig();
						return true;
					}
					return false;
				}
			}
		}
		return false;
	}
}
