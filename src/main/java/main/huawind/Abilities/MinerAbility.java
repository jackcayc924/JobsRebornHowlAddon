package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class MinerAbility implements Listener {

	public boolean test(Player player, Block block) {
		return GriefPrevention.instance.allowBreak(player, block, block.getLocation()) == null;
	}

	List<Material> miner = Arrays.asList(Material.IRON_ORE, Material.DIAMOND_ORE, Material.COAL_ORE, Material.GOLD_ORE);

	private void veinMiner(Block block) {
		block.breakNaturally();

		Arrays.asList("UP", "DOWN", "NORTH", "SOUTH", "EAST", "WEST").stream()
				.map(BlockFace::valueOf)
				.map(block::getRelative)
				.forEach(nearbyBlock -> {
					if (miner.contains(nearbyBlock.getType()))
						veinMiner(nearbyBlock);
				});
	}

	private Map<UUID, Long> abilityDuration = new HashMap<>();
	private Map<UUID, Long> cooldowns = new HashMap<>();

	@EventHandler
	public void minerAbility2(BlockBreakEvent e) {
		Block block = e.getBlock();
		String type = block.getType().toString();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer());
		List<String> list = Custom.get().getStringList("veinminer.players");
		Job miner = Jobs.getJob("Miner");
		if (jobsPlayer.isInJob(miner)) {
			int minerlevel = jobsPlayer.getJobProgression(miner).getLevel();
			if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 50) {
				if (!list.contains(e.getPlayer().getUniqueId().toString())) {
					if (test(e.getPlayer(), e.getBlock())) {
						if (!type.contains("ORE")) return;
						veinMiner(e.getBlock());
					}
				}
			}
		}
	}

	@EventHandler
	public void minerAbility(PlayerInteractEvent e) {
		List<Material> pickaxes = Arrays.asList(Material.STONE_PICKAXE, Material.DIAMOND_PICKAXE, Material.IRON_PICKAXE,
				Material.GOLDEN_PICKAXE, Material.NETHERITE_PICKAXE, Material.WOODEN_PICKAXE);
		Action action = e.getAction();
		Player p = e.getPlayer();
		BukkitTask task = new BukkitRunnable() {
			public void run() {
				if (cooldowns.containsKey(e.getPlayer().getUniqueId())) {
					if (cooldowns.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER:" + ChatColor.RESET + "" + ChatColor.DARK_AQUA + " Your ability is now ready"); // RUNNABLE TO CHECK IF ABILITY READy
						cooldowns.remove(e.getPlayer().getUniqueId());
						this.cancel();
					}
				}
				if (abilityDuration.containsKey(e.getPlayer().getUniqueId())) {
					if (abilityDuration.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						abilityDuration.remove(e.getPlayer().getUniqueId());
						p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER:" + ChatColor.RESET + "" + ChatColor.DARK_AQUA + " Your ability has wore off");
					}
				}
			}
		}.runTaskTimer(NaturesHowl.getPlugin(),0,20L);
		EquipmentSlot hand = e.getHand();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer());
		Job miner = Jobs.getJob("Miner");
		if (jobsPlayer.isInJob(miner)) {
			int minerlevel = jobsPlayer.getJobProgression(miner).getLevel();
			if (action.equals(Action.RIGHT_CLICK_BLOCK) && p.isSneaking() || action.equals(Action.RIGHT_CLICK_AIR) && p.isSneaking()) {
				if (hand.equals(EquipmentSlot.HAND)) {
					if (jobsPlayer.isInJob(Jobs.getJob("Miner"))) {
						if (pickaxes.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
							if (cooldowns.containsKey(p.getUniqueId())) // player in hashmap
							{
								if (cooldowns.get(p.getUniqueId()) > System.currentTimeMillis()) {
									long timeleft = (cooldowns.get(p.getUniqueId()) - System.currentTimeMillis()) / 1000;
									p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

								}
							}
						}
						if (!cooldowns.containsKey(p.getUniqueId())) {
							if (pickaxes.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 10 && minerlevel <= 19) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl10") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl10") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 20 && minerlevel <= 29) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl20") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl20") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 30 && minerlevel <= 39) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl30") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl30") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 40 && minerlevel <= 49) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl40") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl40") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 50 && minerlevel <= 59) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl50") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl50") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 60 && minerlevel <= 69) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl60") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl60") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 70 && minerlevel <= 79) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl70") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl70") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 80 && minerlevel <= 89) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl80") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl80") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 90 && minerlevel <= 99) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl90") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl90") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel == 100) {
									abilityDuration.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.abilityduration.lvl100") * 1000L);
									cooldowns.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Miner.cooldown.lvl100") * 1000L);
									Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "MINER: " + ChatColor.RESET + "" + ChatColor.DARK_AQUA + "Dig! Dig! Dig!");
								}
							}
						}
					}
				}
			}
		}
	}
	@EventHandler
	public void minerAbility(BlockBreakEvent e) {
		List<Material> pickaxes = Arrays.asList(Material.STONE_PICKAXE, Material.DIAMOND_PICKAXE, Material.IRON_PICKAXE,
				Material.GOLDEN_PICKAXE, Material.NETHERITE_PICKAXE, Material.WOODEN_PICKAXE);

		List<Material> blacklisted = Arrays.asList(Material.TORCH, Material.REDSTONE_TORCH, Material.REDSTONE, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM,
				Material.FIRE, Material.FLOWER_POT, Material.TNT, Material.SEA_PICKLE, Material.SCAFFOLDING, Material.SLIME_BLOCK, Material.HONEY_BLOCK, Material.REDSTONE_WALL_TORCH,
				Material.WALL_TORCH, Material.COMPARATOR, Material.REPEATER, Material.REDSTONE_WIRE, Material.TRIPWIRE, Material.STRING, Material.TRIPWIRE, Material.TRIPWIRE_HOOK,
				Material.TWISTING_VINES, Material.TWISTING_VINES_PLANT, Material.WEEPING_VINES, Material.WEEPING_VINES_PLANT);

		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer());
		Job miner = Jobs.getJob("Miner");
		if (jobsPlayer.isInJob(miner)) {
			int minerlevel = jobsPlayer.getJobProgression(miner).getLevel();
			Location location = e.getBlock().getLocation();
			List<Block> blocks = new ArrayList<>();
			if (blacklisted.contains(e.getBlock().getType()) || e.getBlock().getType().toString().contains("CORAL")) {
				return;
			}
			if (abilityDuration.containsKey(e.getPlayer().getUniqueId())) {
				if (pickaxes.contains(e.getPlayer().getInventory().getItemInMainHand().getType())) {
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 10 && minerlevel <= 19) {
						int radius = Custom.get().getInt("Miner.radius.lvl10");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 20 && minerlevel <= 29) {
						int radius = Custom.get().getInt("Miner.radius.lvl20");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 30 && minerlevel <= 39) {
						int radius = Custom.get().getInt("Miner.radius.lvl30");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 40 && minerlevel <= 49) {
						int radius = Custom.get().getInt("Miner.radius.lvl40");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 50 && minerlevel <= 59) {
						int radius = Custom.get().getInt("Miner.radius.lvl50");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 60 && minerlevel <= 69) {
						int radius = Custom.get().getInt("Miner.radius.lvl60");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 70 && minerlevel <= 79) {
						int radius = Custom.get().getInt("Miner.radius.lvl70");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 80 && minerlevel <= 89) {
						int radius = Custom.get().getInt("Miner.radius.lvl80");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 90 && minerlevel <= 99) {
						int radius = Custom.get().getInt("Miner.radius.lvl90");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
					if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel > 99) {
						int radius = Custom.get().getInt("Miner.radius.lvl100");
						for (int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
							for (int y = location.getBlockY() - radius; y <= location.getBlockY() + radius; y++) {
								for (int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
									blocks.add(location.getWorld().getBlockAt(x, y, z));
								}
							}
						}
						for (Block b : blocks) {
							if (test(e.getPlayer(), b)) {
								if (!b.getType().equals(Material.BEDROCK)) {
									b.breakNaturally();
								}
							}
						}
					}
				}
			}
		}
	}
}

