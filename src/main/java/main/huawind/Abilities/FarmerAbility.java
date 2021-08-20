package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Ageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class FarmerAbility implements Listener {

	java.util.Map<UUID, Long> cooldowns = new HashMap<>();
	List<Material> crops = Arrays.asList(Material.WHEAT, Material.CARROTS, Material.POTATOES, Material.NETHER_WART, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.SUGAR_CANE);
	
	public static Boolean percentChance(double chance) {
		return Math.random() <= chance;
	}

	@EventHandler
	public void crops(BlockBreakEvent event) {
		Block block = event.getBlock();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Job farmer = Jobs.getJob("Farmer");
		if (jobsPlayer.isInJob(farmer)) {
			int farmerlevel = jobsPlayer.getJobProgression(farmer).getLevel();
			if (block.getBlockData() instanceof Ageable) {
				Ageable ageable = (Ageable) block.getBlockData();
				if (crops.contains(block.getType())) {
					if (farmerlevel >= 10 && farmerlevel <= 19) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl10"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl10"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 20 && farmerlevel <= 29) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl20"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl20"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 30 && farmerlevel <= 39) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl30"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl30"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 40 && farmerlevel <= 49) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl40"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl40"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 50 && farmerlevel <= 59) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl50"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl50"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 60 && farmerlevel <= 69) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl60"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl60"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 70 && farmerlevel <= 79) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl70"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl70"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 80 && farmerlevel <= 89) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl80"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl80"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel >= 90 && farmerlevel <= 99) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl90"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl90"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
					if (farmerlevel == 100) {
						if ((ageable.getAge() == ageable.getMaximumAge())) {
							if (percentChance(Custom.get().getDouble("Farmer.drops.lvl100"))) {
								Location loc = event.getBlock().getLocation();
								ItemStack item = new ItemStack(event.getBlock().getType());
								item.setAmount(Custom.get().getInt("Farmer.dropamount.lvl100"));
								event.getPlayer().getWorld().dropItem(loc, item);
							}
						}
					}
				}
			}
		}
	}


	// BEGIN FARMER ABILITIES
	@EventHandler
	public void sneakFarmGrow(PlayerMoveEvent event) {
		boolean check = false;
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Block block = event.getPlayer().getLocation().getBlock().getRelative(BlockFace.UP);
		Job farmer = Jobs.getJob("Farmer");
		if (jobsPlayer.isInJob(farmer)) {
		int farmerlevel = jobsPlayer.getJobProgression(farmer).getLevel();
			if (event.getPlayer().isSneaking()) {
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 10 && farmerlevel <= 19) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().get("Farmer.cooldown.lvl10") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl10") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl10") * 20L);
					check = false;
				}
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 20 && farmerlevel <= 29) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl20") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl20") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl20") * 20L);
					check = false;
				}
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 30 && farmerlevel <= 39) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl30") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl30") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl30") * 20L);
					check = false;
				}
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 40 && farmerlevel <= 49) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl40") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl40") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl40") * 20L);
					check = false;
				}
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 50 && farmerlevel <= 59) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl50") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl50") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl50") * 20L);
					check = false;
				}
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
				{
					if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						return;
					}
				}
				if (farmerlevel >= 60 && farmerlevel <= 69) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER: " + ChatColor.RESET + "" + ChatColor.GOLD + " You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl60") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl60") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER:" + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lvl60") * 20L);
					check = false;
				}
				if (farmerlevel >= 70 && farmerlevel <= 79) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER:" + ChatColor.RESET + "" + ChatColor.GOLD + " You have used your Farmer ability!");
							event.getPlayer().sendMessage(ChatColor.GOLD + "You are now on cooldown for " + Custom.get().getInt("Farmer.cooldown.lvl70") + " seconds");
							check = true;
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl70") * 1000L));
						}
					}
				}
				if (check) {
					Bukkit.getScheduler().runTaskLater(NaturesHowl.getPlugin(), new Runnable() {
						@Override
						public void run() {
							event.getPlayer().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "FARMER:" + ChatColor.RESET + "" + ChatColor.GOLD + "Your ability is now ready");
						}

					}, Custom.get().getInt("Farmer.cooldown.lv70") * 20L);
					check = false;
				}
				if (farmerlevel >= 80 && farmerlevel <= 89) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl80") * 1000L));
						}
					}
				}
				if (farmerlevel >= 90 && farmerlevel <= 99) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getMaximumAge());
							block.setBlockData(ageable);
							cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + (Custom.get().getInt("Farmer.cooldown.lvl90") * 1000L));
						}
					}
				}
				if (farmerlevel == 100) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getAge() + 1);
							block.setBlockData(ageable);
						}
					}
				}
			}
		}
	}
}
