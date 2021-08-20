package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.Arrays;
import java.util.List;

public class BuilderAbility implements Listener {
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

	@EventHandler
	public void returnBlock(BlockPlaceEvent event) {
		Player p = event.getPlayer();
		PlayerInventory inven = event.getPlayer().getInventory();
		ItemStack item = new ItemStack(event.getBlock().getType());
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Job builder = Jobs.getJob("Builder");
		if (jobsPlayer.isInJob(builder)) {
			int builderlevel = jobsPlayer.getJobProgression(builder).getLevel();
			List<Material> blacklisted = Arrays.asList(Material.DIAMOND_BLOCK, Material.TNT, Material.SPAWNER,
					Material.GOLD_BLOCK, Material.IRON_BLOCK, Material.BEACON, Material.DRAGON_EGG, Material.END_PORTAL,
					Material.DIAMOND_ORE, Material.GOLD_ORE, Material.IRON_ORE, Material.NETHERITE_BLOCK, Material.BEDROCK, Material.SHULKER_BOX);
			if (blacklisted.contains(event.getBlock().getType())) {
				return;
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 10 && builderlevel <= 19) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl10"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 20 && builderlevel <= 29) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl20"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 30 && builderlevel <= 39) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl30"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 40 && builderlevel <= 49) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl40"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 50 && builderlevel <= 59) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl50"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 60 && builderlevel <= 69) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl60"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 70 && builderlevel <= 79) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl70"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 80 && builderlevel <= 89) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl80"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 90 && builderlevel <= 99) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl90"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel == 100) {
				if (percentChance(Custom.get().getDouble("Builder.refund.lvl100"))) {
					item.setAmount(1);
					inven.addItem(item);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					if (!hasAvaliableSlot(p, 1)) {
						Location loc = event.getPlayer().getLocation();
						p.getWorld().dropItem(loc, item);
						p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your block has been refunded");
					}
				}
			}
		}
	}

	@EventHandler
	public void bonusCraft(CraftItemEvent event) {
		Player p = (Player) event.getWhoClicked();
		CraftingInventory inven = event.getInventory();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(p);
		Job builder = Jobs.getJob("Builder");
		if (jobsPlayer.isInJob(builder)) {
			int builderlevel = jobsPlayer.getJobProgression(builder).getLevel();

			List<Material> blacklisted = Arrays.asList(Material.GOLD_BLOCK, Material.NETHERITE_BLOCK, Material.DIAMOND_BLOCK, Material.IRON_BLOCK,
					Material.COAL_BLOCK, Material.QUARTZ_BLOCK, Material.REDSTONE_BLOCK, Material.GOLD_INGOT, Material.NETHERITE_INGOT, Material.DIAMOND, Material.IRON_INGOT,
					Material.COAL, Material.QUARTZ, Material.REDSTONE, Material.IRON_NUGGET, Material.GOLD_NUGGET);

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 10 && builderlevel <= 19) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl10"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;

					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 20 && builderlevel <= 29) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl20"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 30 && builderlevel <= 39) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl30"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 40 && builderlevel <= 49) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl40"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 50 && builderlevel <= 59) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl50"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 60 && builderlevel <= 69) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl60"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 70 && builderlevel <= 79) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl70"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 80 && builderlevel <= 89) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl80"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel >= 90 && builderlevel <= 99) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl90"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + " Your crafted item has doubled!");
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Builder")) && builderlevel == 100) {
				if (percentChance(Custom.get().getDouble("Builder.doubleitem.lvl100"))) {
					if (blacklisted.contains(inven.getResult().getType())) return;
					if (event.getWhoClicked().getItemOnCursor().getAmount() >= 1 && event.isLeftClick() || event.isRightClick())
						return;
					inven.getResult().setAmount(inven.getResult().getAmount() * 2);
					p.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "BUILDER:" + ChatColor.RESET + ChatColor.GREEN + "Your crafted item has doubled!");
				}
			}
		}
	}
}


