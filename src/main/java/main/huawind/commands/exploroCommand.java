package main.huawind.commands;

import main.huawind.files.Custom;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class exploroCommand implements CommandExecutor {


	public boolean isInventoryFull(Player p) {
		return p.getInventory().firstEmpty() == -1;
	}

	public static Map<UUID, Integer> exploroHashMap = new HashMap<>();

	public static void saveHashMap()
	{
		exploroHashMap.keySet().forEach(uuid -> Custom.get().set("exploroMap." + uuid, exploroHashMap.get(exploroHashMap)));
	}

	public static void loadHashMap()
	{
		Custom.get().getConfigurationSection("exploroMap.").getKeys(false).forEach(uuid -> exploroHashMap.put(UUID.fromString(uuid), Custom.get().getInt("exploroMap." + uuid)));
	}


	// exploro command gives you the stick to teleport as an explorer
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player) sender;
		ItemStack[] inventory = p.getInventory().getContents();
		ItemStack item = new ItemStack(Material.STICK);
		ItemMeta item_meta = item.getItemMeta();
		ArrayList<String> item_lore = new ArrayList<>();
		PlayerInventory inv = p.getInventory();

		item_meta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Exploro");
		item_lore.add(" ");
		item_lore.add(ChatColor.GREEN + "✦ An ability passed down to explorers by the Nature Gods");
		item_lore.add(" ");
		item_meta.addEnchant(Enchantment.OXYGEN, 1, false);
		item_meta.setLore(item_lore);
		item.setItemMeta(item_meta);

		if (label.equalsIgnoreCase("exploro")) {
			if (sender.hasPermission("explorer.exploro")) {
				if (args.length == 0) {
						if (!isInventoryFull(p)) {
							if (!exploroHashMap.containsKey(p.getUniqueId())) {
								inv.setItem(inv.firstEmpty(), item);
								exploroHashMap.put(p.getUniqueId(), 1);
							}
						}
							if (p.getInventory().contains(Material.STICK)) {
								if(exploroHashMap.containsKey(p.getUniqueId())) {
									for (ItemStack i : inventory) {
										if (i != null) {
											if (i.hasItemMeta()) {
												ItemMeta iMeta = i.getItemMeta();
												if (iMeta.hasLore()) {
													for (String line : iMeta.getLore()) {
														if (line.contains(ChatColor.GREEN + "✦ An ability passed down to explorers by the Nature Gods")) {
															p.getInventory().remove(i);
															exploroHashMap.remove(p.getUniqueId());
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
		return false;
	}
}
