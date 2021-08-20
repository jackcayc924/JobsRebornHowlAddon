package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class WoodcutterAbility implements Listener {

	public boolean test(Player player, Block block) {
		return GriefPrevention.instance.allowBreak(player, block, block.getLocation()) == null;
	}

	public static Boolean percentChance(double chance) {
		return Math.random() <= chance;
	}

	List<Material> WOODCUTTER = Arrays.asList(Material.SPRUCE_LEAVES, Material.OAK_FENCE, Material.OAK_LEAVES, Material.JUNGLE_LEAVES,
			Material.DARK_OAK_LEAVES, Material.BIRCH_LEAVES, Material.ACACIA_LEAVES, Material.OAK_WOOD, Material.SPRUCE_WOOD,
			Material.JUNGLE_WOOD, Material.BIRCH_WOOD, Material.ACACIA_WOOD, Material.DARK_OAK_WOOD, Material.ORANGE_WOOL,
			Material.ORANGE_CONCRETE, Material.ORANGE_STAINED_GLASS, Material.ORANGE_STAINED_GLASS_PANE, Material.RED_TERRACOTTA,
			Material.PINK_TERRACOTTA, Material.PINK_WOOL, Material.OAK_LOG, Material.SPRUCE_LOG, Material.JUNGLE_LOG, Material.BIRCH_LOG,
			Material.ACACIA_LOG, Material.DARK_OAK_LOG, Material.SNOW, Material.OAK_BUTTON, Material.COCOA_BEANS);

	Map<UUID, Long> abilityDuration = new HashMap<>();
	Map<UUID, Long> cooldowns = new HashMap<>();

	@EventHandler
	public void WoodcutterAbility(PlayerInteractEvent e) {
		List<Material> axes = Arrays.asList(Material.STONE_AXE, Material.DIAMOND_AXE, Material.IRON_AXE,
				Material.GOLDEN_AXE, Material.NETHERITE_AXE, Material.WOODEN_AXE);
		Action action = e.getAction();
		Player p = e.getPlayer();
		BukkitTask task = new BukkitRunnable() {
			public void run() {
				if (cooldowns.containsKey(e.getPlayer().getUniqueId())) {
					if (cooldowns.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER:" + ChatColor.RESET + "" + ChatColor.YELLOW + " Your ability is now ready"); // RUNNABLE TO CHECK IF ABILITY READy
						cooldowns.remove(e.getPlayer().getUniqueId());
						this.cancel();
					}
				}
				if (abilityDuration.containsKey(e.getPlayer().getUniqueId())) {
					if (abilityDuration.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						abilityDuration.remove(e.getPlayer().getUniqueId());
						p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER:" + ChatColor.RESET + "" + ChatColor.YELLOW + " Your ability has wore off");
					}
				}
			}
		}.runTaskTimer(NaturesHowl.getPlugin(),0,20L);
		EquipmentSlot hand = e.getHand();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer());
		Job woodcutter = Jobs.getJob("Woodcutter");
		if (jobsPlayer.isInJob(woodcutter)) {
			int woodcutterlevel = jobsPlayer.getJobProgression(woodcutter).getLevel();
			if (action.equals(Action.RIGHT_CLICK_BLOCK) && p.isSneaking() || action.equals(Action.RIGHT_CLICK_AIR) && p.isSneaking()) {
				if (hand.equals(EquipmentSlot.HAND)) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter"))) {
						if (axes.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
							if (cooldowns.containsKey(p.getUniqueId())) // player in hashmap
							{
								if (cooldowns.get(p.getUniqueId()) > System.currentTimeMillis()) {
									long timeleft = (cooldowns.get(p.getUniqueId()) - System.currentTimeMillis()) / 1000;
									p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

								}
							}
							if (!cooldowns.containsKey(p.getUniqueId())) {
								if (axes.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 10 && woodcutterlevel <= 19) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl10") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl10") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 20 && woodcutterlevel <= 29) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl20") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl20") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 30 && woodcutterlevel <= 39) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl30") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl30") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 40 && woodcutterlevel <= 49) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl40") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl40") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 50 && woodcutterlevel <= 59) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl50") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl50") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 60 && woodcutterlevel <= 69) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl60") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl60") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 70 && woodcutterlevel <= 79) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl70") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl70") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 80 && woodcutterlevel <= 89) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl80") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl80") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 90 && woodcutterlevel <= 99) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl90") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl90") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
									if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel == 100) {
										abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.abilityduration.lvl10") * 1000L);
										cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Woodcutter.cooldown.lvl100") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
										p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Chop! Chop! Chop!");
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Block block = event.getBlock();
		String axe = event.getPlayer().getInventory().getItemInMainHand().toString();
		Job woodcutter = Jobs.getJob("Woodcutter");
		if (jobsPlayer.isInJob(woodcutter)) {
			int woodcutterlevel = jobsPlayer.getJobProgression(woodcutter).getLevel();
			if (abilityDuration.containsKey(event.getPlayer().getUniqueId())) {
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 10 && woodcutterlevel <= 19) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 20 && woodcutterlevel <= 29) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 30 && woodcutterlevel <= 39) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 40 && woodcutterlevel <= 49) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 50 && woodcutterlevel <= 59) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 60 && woodcutterlevel <= 69) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 70 && woodcutterlevel <= 79) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 80 && woodcutterlevel <= 89) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 90 && woodcutterlevel <= 99) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
				if (axe.contains("AXE")) {
					if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel > 99) {
						if (test(event.getPlayer(), event.getBlock())) {
							if (!WOODCUTTER.contains(event.getBlock().getType())) return;
							treeFell(block);
						} else {
							event.setCancelled(true);
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onSaplingPlace(BlockPlaceEvent event) {
		Player p = event.getPlayer();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Block block = event.getBlock();
		Job woodcutter = Jobs.getJob("Woodcutter");
		if (jobsPlayer.isInJob(woodcutter)) {
			int woodcutterlevel = jobsPlayer.getJobProgression(woodcutter).getLevel();
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 10 && woodcutterlevel <= 19) {
				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl10"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 20 && woodcutterlevel <= 29) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl20"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 30 && woodcutterlevel <= 39) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl30"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 40 && woodcutterlevel <= 49) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl40"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 50 && woodcutterlevel <= 59) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl50"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 60 && woodcutterlevel <= 69) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl60"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 70 && woodcutterlevel <= 79) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl70"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 80 && woodcutterlevel <= 89) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl80"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel >= 90 && woodcutterlevel <= 99) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl90"))) {
					growSapling(block, p);
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter")) && woodcutterlevel == 100) {

				if (percentChance(Custom.get().getDouble("Woodcutter.saplings.lvl100"))) {
					growSapling(block, p);
				}
			}
		}
	}

	private void treeFell(Block block) {
		block.breakNaturally();

		Arrays.asList("UP", "NORTH", "SOUTH", "EAST", "WEST").stream()
				.map(BlockFace::valueOf)
				.map(block::getRelative)
				.forEach(nearbyBlock -> {
					if (WOODCUTTER.contains(nearbyBlock.getType()))
						treeFell(nearbyBlock);
				});
	}

	private void growSapling(Block block, Player p) {
		String message = ChatColor.YELLOW + "" + ChatColor.BOLD + "WOODCUTTER: " + ChatColor.RESET + "" + ChatColor.YELLOW + "Your tree has grown instantly";
		if (block.getType().equals(Material.OAK_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.BIG_TREE);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
		if (block.getType().equals(Material.ACACIA_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.ACACIA);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
		if (block.getType().equals(Material.SPRUCE_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.REDWOOD);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
		if (block.getType().equals(Material.DARK_OAK_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.DARK_OAK);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
		if (block.getType().equals(Material.JUNGLE_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.JUNGLE);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
		if (block.getType().equals(Material.BIRCH_SAPLING)) {
			block.setType(Material.AIR);
			Location location = block.getLocation();
			location.getWorld().generateTree(location, TreeType.BIRCH);
			p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 10F, 0.5F);
			p.sendMessage(message);
		}
	}
}

